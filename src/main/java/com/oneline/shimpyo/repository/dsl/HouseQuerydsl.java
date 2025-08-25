package com.oneline.shimpyo.repository.dsl;

import com.oneline.shimpyo.domain.house.HouseType;
import com.oneline.shimpyo.domain.house.dto.*;
import com.oneline.shimpyo.domain.member.Member;
import com.oneline.shimpyo.domain.reservation.ReservationStatus;
import com.oneline.shimpyo.domain.room.Room;

import com.oneline.shimpyo.domain.room.dto.QRoomInfo;
import com.oneline.shimpyo.domain.room.dto.RoomInfo;
import com.querydsl.core.group.GroupBy;
import com.querydsl.core.types.Projections;
import com.querydsl.core.types.dsl.BooleanExpression;
import com.querydsl.jpa.impl.JPAQueryFactory;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;


import java.time.LocalDateTime;
import java.util.List;

import static com.oneline.shimpyo.domain.house.QHouse.house;
import static com.oneline.shimpyo.domain.house.QHouseAddress.houseAddress;
import static com.oneline.shimpyo.domain.house.QHouseImage.houseImage;
import static com.oneline.shimpyo.domain.house.QHouseOptions.houseOptions;
import static com.oneline.shimpyo.domain.reservation.QReservation.reservation;
import static com.oneline.shimpyo.domain.room.QRoom.room;
import static com.oneline.shimpyo.domain.room.QRoomImage.roomImage;
import static com.oneline.shimpyo.domain.wish.QWish.wish;

@Repository
public class HouseQuerydsl {
    private final JPAQueryFactory jqf;

    public HouseQuerydsl(EntityManager em) {
        this.jqf = new JPAQueryFactory(em);
    }

    public List<GetMyHouseListRes> readMyHouseList(long memberId) {
        return jqf.select(new QGetMyHouseListRes(house.id, house.name, houseImage.savedURL, house.type))
                .from(house)
                .join(house.images, houseImage)
                .where(house.member.id.eq(memberId))
                .groupBy(house)
                .fetch();
    }

    public HouseInfo findHouseAndAddressByHouseId(long houseId) {
        return jqf.select(new QHouseInfo(house.id, house.name, house.type, house.contents, houseAddress.postCode
                                                        , houseAddress.sido, houseAddress.sigungu, houseAddress.fullAddress, houseAddress.lat, houseAddress.lng))
                .from(house)
                .join(house.houseAddress, houseAddress)
                .on(house.id.eq(houseAddress.house.id))
                .where(house.id.eq(houseId))
                .fetchOne();
    }

    public List<String> findHouseImagesByHouseId(long houseId) {
        return jqf.select(houseImage.savedURL)
                .from(houseImage)
                .where(houseImage.house.id.eq(houseId))
                .fetch();
    }

    public List<String> findHouseOptionsByHouseId(long houseId) {
        return jqf.select(houseOptions.name)
                .from(houseOptions)
                .where(houseOptions.house.id.eq(houseId))
                .fetch();
    }

    public List<RoomInfo> findRoomsByHouseId(long houseId) {
        return jqf.select(new QRoomInfo(room.id, room.name, room.price, room.minPeople, room.maxPeople, room.bedCount, room.bedroomCount
                                    , room.bathroomCount, room.totalCount, room.checkIn, room.checkOut))
                .from(room)
                .where(room.house.id.eq(houseId))
                .fetch();
    }

    public List<String> findRoomImagesByRoomId(long roomId) {
        return jqf.select(roomImage.savedURL)
                .from(roomImage)
                .where(roomImage.room.id.eq(roomId))
                .fetch();
    }

    public List<GetHouseListRes> findAllHouseNoLogin(Pageable pageable, SearchFilterReq searchFilter) {
        return jqf.selectFrom(house)
                .leftJoin(house.images, houseImage)
                .leftJoin(house.houseAddress, houseAddress)
                .leftJoin(house.rooms, room)
                .orderBy(house.avgRating.desc())
                .where(minPeopleLoe(searchFilter.getPeople()), maxPeopleGoe(searchFilter.getPeople()),
                        typeEq(searchFilter.getType()), cityEq(searchFilter.getCity()), districtEq(searchFilter.getDistrict()))
                .offset(pageable.getOffset())
                .groupBy(houseImage, houseAddress.sido, houseAddress.sigungu)
                .transform(GroupBy.groupBy(house.id).list(new QGetHouseListRes(
                        house.id, house.name, house.type, room.price, houseAddress.sido,
                        houseAddress.sigungu, room.id, house.avgRating,
                        GroupBy.list(houseImage.savedURL))
                ));
    }

    public List<GetHouseListRes> findAllHouseLogin(Pageable pageable, SearchFilterReq searchFilter, Member member) {
        return jqf.selectFrom(house)
                .leftJoin(house.images, houseImage)
                .leftJoin(house.houseAddress, houseAddress)
                .leftJoin(house.rooms, room)
                .leftJoin(house.wishList, wish).on(wish.house.eq(house), wish.member.eq(member))
                .orderBy(house.avgRating.desc())
                .where(minPeopleLoe(searchFilter.getPeople()), maxPeopleGoe(searchFilter.getPeople()),
                        typeEq(searchFilter.getType()), cityEq(searchFilter.getCity()), districtEq(searchFilter.getDistrict()))
                .offset(pageable.getOffset())
                .groupBy(houseImage, houseAddress.sido, houseAddress.sigungu)
                .transform(GroupBy.groupBy(house.id).list(new QGetHouseListRes(
                        house.id, house.name, house.type, room.price, houseAddress.sido,
                        houseAddress.sigungu, room.id, house.avgRating, wish.member.id.eq(member.getId()),
                        GroupBy.list(houseImage.savedURL))
                ));
    }

    // 동적 Query DSL Where 조건
    private BooleanExpression minPeopleLoe(int minPeople) {
        return minPeople != 0 ? room.minPeople.loe(minPeople) : null;
    }
    private BooleanExpression maxPeopleGoe(int maxPeople) {
        return maxPeople != 0 ? room.maxPeople.goe(maxPeople) : null;
    }
    private BooleanExpression typeEq(HouseType type) {
        return type != null ? house.type.eq(type) : null;
    }
    private BooleanExpression cityEq(String city) {
        return city != null ? houseAddress.sido.eq(city) : null;
    }
    private BooleanExpression districtEq(String district) {
        return district != null ? houseAddress.sigungu.eq(district) : null;
    }

    // 예약 현황 확인
    public boolean checkReservation(long roomId, LocalDateTime checkIn, LocalDateTime checkOut) {
        Room foundRoom = jqf.selectFrom(room)
                .where(room.id.eq(roomId))
                .fetchOne();
        long reservedCount = jqf.select(reservation.count())
                .from(reservation)
                .where(reservation.reservationStatus.eq(ReservationStatus.COMPLETE), reservation.room.id.eq(foundRoom.getId()),
                        reservation.checkInDate.loe(checkIn),
                        reservation.checkOutDate.goe(checkOut))
                .fetchOne();
        return (foundRoom.getTotalCount() <= reservedCount) ? true : false;
    }
}
