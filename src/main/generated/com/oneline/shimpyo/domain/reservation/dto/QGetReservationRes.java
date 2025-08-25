package com.oneline.shimpyo.domain.reservation.dto;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.ConstructorExpression;
import javax.annotation.processing.Generated;

/**
 * com.oneline.shimpyo.domain.reservation.dto.QGetReservationRes is a Querydsl Projection type for GetReservationRes
 */
@Generated("com.querydsl.codegen.DefaultProjectionSerializer")
public class QGetReservationRes extends ConstructorExpression<GetReservationRes> {

    private static final long serialVersionUID = 1802992241L;

    public QGetReservationRes(com.querydsl.core.types.Expression<Long> houseId, com.querydsl.core.types.Expression<Long> reservationId, com.querydsl.core.types.Expression<com.oneline.shimpyo.domain.reservation.ReservationStatus> reservationStatus, com.querydsl.core.types.Expression<Long> houseOwnerId, com.querydsl.core.types.Expression<String> houseName, com.querydsl.core.types.Expression<String> houseOwnerName, com.querydsl.core.types.Expression<java.time.LocalDateTime> checkInDate, com.querydsl.core.types.Expression<java.time.LocalDateTime> checkOutDate, com.querydsl.core.types.Expression<java.time.LocalTime> checkInTime, com.querydsl.core.types.Expression<java.time.LocalTime> checkoutTime, com.querydsl.core.types.Expression<Long> roomId, com.querydsl.core.types.Expression<String> roomName, com.querydsl.core.types.Expression<Integer> maxPeople, com.querydsl.core.types.Expression<Integer> minPeople, com.querydsl.core.types.Expression<Integer> peopleCount, com.querydsl.core.types.Expression<Double> lat, com.querydsl.core.types.Expression<Double> lng, com.querydsl.core.types.Expression<String> address, com.querydsl.core.types.Expression<Integer> price, com.querydsl.core.types.Expression<Integer> remainPrice, com.querydsl.core.types.Expression<Long> reviewId) {
        super(GetReservationRes.class, new Class<?>[]{long.class, long.class, com.oneline.shimpyo.domain.reservation.ReservationStatus.class, long.class, String.class, String.class, java.time.LocalDateTime.class, java.time.LocalDateTime.class, java.time.LocalTime.class, java.time.LocalTime.class, long.class, String.class, int.class, int.class, int.class, double.class, double.class, String.class, int.class, int.class, long.class}, houseId, reservationId, reservationStatus, houseOwnerId, houseName, houseOwnerName, checkInDate, checkOutDate, checkInTime, checkoutTime, roomId, roomName, maxPeople, minPeople, peopleCount, lat, lng, address, price, remainPrice, reviewId);
    }

    public QGetReservationRes(com.querydsl.core.types.Expression<Long> houseId, com.querydsl.core.types.Expression<Long> reservationId, com.querydsl.core.types.Expression<com.oneline.shimpyo.domain.reservation.ReservationStatus> reservationStatus, com.querydsl.core.types.Expression<Long> houseOwnerId, com.querydsl.core.types.Expression<String> houseName, com.querydsl.core.types.Expression<String> houseOwnerName, com.querydsl.core.types.Expression<java.time.LocalDateTime> checkInDate, com.querydsl.core.types.Expression<java.time.LocalDateTime> checkOutDate, com.querydsl.core.types.Expression<java.time.LocalTime> checkInTime, com.querydsl.core.types.Expression<java.time.LocalTime> checkoutTime, com.querydsl.core.types.Expression<Long> roomId, com.querydsl.core.types.Expression<String> roomName, com.querydsl.core.types.Expression<Integer> maxPeople, com.querydsl.core.types.Expression<Integer> minPeople, com.querydsl.core.types.Expression<Integer> peopleCount, com.querydsl.core.types.Expression<Double> lat, com.querydsl.core.types.Expression<Double> lng, com.querydsl.core.types.Expression<String> address, com.querydsl.core.types.Expression<Integer> price, com.querydsl.core.types.Expression<Integer> remainPrice) {
        super(GetReservationRes.class, new Class<?>[]{long.class, long.class, com.oneline.shimpyo.domain.reservation.ReservationStatus.class, long.class, String.class, String.class, java.time.LocalDateTime.class, java.time.LocalDateTime.class, java.time.LocalTime.class, java.time.LocalTime.class, long.class, String.class, int.class, int.class, int.class, double.class, double.class, String.class, int.class, int.class}, houseId, reservationId, reservationStatus, houseOwnerId, houseName, houseOwnerName, checkInDate, checkOutDate, checkInTime, checkoutTime, roomId, roomName, maxPeople, minPeople, peopleCount, lat, lng, address, price, remainPrice);
    }

}

