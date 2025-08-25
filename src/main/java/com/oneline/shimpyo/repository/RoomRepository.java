package com.oneline.shimpyo.repository;

import com.oneline.shimpyo.domain.room.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Lock;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import jakarta.persistence.LockModeType;
import java.util.List;
import java.util.Optional;

public interface RoomRepository extends JpaRepository<Room, Long> {
    List<Room> findAllByHouseId(Long id);

    @Lock(LockModeType.OPTIMISTIC)
    @Query("select r from Room r where r.id = :id")
    Optional<Room> findByIdWithLock(@Param("id") Long id);

    @Lock(LockModeType.PESSIMISTIC_WRITE)
    @Query("select r from Room r where r.id = :id")
    Optional<Room> findByIdPessimisticLock(@Param("id") Long id);
}
