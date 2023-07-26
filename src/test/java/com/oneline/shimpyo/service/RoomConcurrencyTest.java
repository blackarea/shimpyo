package com.oneline.shimpyo.service;

import com.oneline.shimpyo.domain.house.House;
import com.oneline.shimpyo.domain.member.Member;
import com.oneline.shimpyo.domain.room.Room;
import com.oneline.shimpyo.repository.*;
import com.oneline.shimpyo.service.impl.RoomServiceImpl;
import lombok.extern.log4j.Log4j2;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Log4j2
@SpringBootTest
public class RoomConcurrencyTest {

    @Autowired
    HouseRepository houseRepository;
    @Autowired
    RoomRepository roomRepository;
    @Autowired
    PaymentRepository paymentRepository;
    @Autowired
    ReservationRepository reservationRepository;
    @Autowired
    MemberRepository memberRepository;
    @Autowired
    RoomServiceImpl roomService;

    @BeforeEach
    public void Init(){
        Member member = Member.builder().email("12345").password("12345").nickname("예약자")
                .phoneNumber("01012345678").point(1).build();
        memberRepository.save(member);
        House house = House.builder().name("testHouse").member(member).build();
        houseRepository.save(house);
        Room room = Room.builder().name("testRoom").bedCount(0).price(100).minPeople(2).maxPeople(3)
                .totalCount(1).house(house).build();
        roomRepository.save(room);
    }

    @Test
    @DisplayName("동시성 테스트 - 낙관적락")
    public void concurrencyOptimisticLockTest() throws InterruptedException {
        int count = 25;

        ExecutorService executorService = Executors.newFixedThreadPool(32);
        CountDownLatch latch = new CountDownLatch(count);
        for (int i = 0; i < count; i++) {
            executorService.execute(() -> {
                try{
                    roomService.increaseBedCountOptimisticLock(3L);
                }catch (Exception e){
                    e.printStackTrace();
                }
                latch.countDown();
            });
        }
        latch.await();

        Room room = roomRepository.findById(3L).get();
        log.info("room.getBedCount() : " + room.getBedCount());
        Assertions.assertThat(room.getBedCount()).isEqualTo(count);
    }

    /*@Test
    @DisplayName("동시성 실패 테스트")
    public void concurrencyFailTest() throws InterruptedException {
        int count = 100;

        ExecutorService executorService = Executors.newFixedThreadPool(32);
        CountDownLatch latch = new CountDownLatch(count);
        for (int i = 0; i < count; i++) {
            executorService.execute(() -> {
                try{
                    roomService.increaseBedCount(3L);
                }catch (Exception e){
                    e.printStackTrace();
                }
                latch.countDown();
            });
        }
        latch.await();

        Room room = roomRepository.findById(3L).get();
        log.info("room.getBedCount() : " + room.getBedCount());
        Assertions.assertThat(room.getBedCount()).isNotEqualTo(count);
    }

    @Test
    @DisplayName("동시성 테스트 - 비관적락")
    public void concurrencyPessimisticLockTest() throws InterruptedException {
        int count = 100;

        ExecutorService executorService = Executors.newFixedThreadPool(32);
        CountDownLatch latch = new CountDownLatch(count);
        for (int i = 0; i < count; i++) {
            executorService.execute(() -> {
                try{
                    roomService.increaseBedCountPessimisticLock(3L);
                }catch (Exception e){
                    e.printStackTrace();
                }
                latch.countDown();
            });
        }
        latch.await();

        Room room = roomRepository.findById(3L).get();
        log.info("room.getBedCount() : " + room.getBedCount());
        Assertions.assertThat(room.getBedCount()).isEqualTo(count);
    }*/

}
