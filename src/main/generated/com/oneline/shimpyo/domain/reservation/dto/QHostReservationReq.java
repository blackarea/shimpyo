package com.oneline.shimpyo.domain.reservation.dto;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.ConstructorExpression;
import javax.annotation.processing.Generated;

/**
 * com.oneline.shimpyo.domain.reservation.dto.QHostReservationReq is a Querydsl Projection type for HostReservationReq
 */
@Generated("com.querydsl.codegen.DefaultProjectionSerializer")
public class QHostReservationReq extends ConstructorExpression<HostReservationReq> {

    private static final long serialVersionUID = -398767725L;

    public QHostReservationReq(com.querydsl.core.types.Expression<Long> reservationId, com.querydsl.core.types.Expression<com.oneline.shimpyo.domain.reservation.ReservationStatus> reservationStatus, com.querydsl.core.types.Expression<String> roomImageUrl, com.querydsl.core.types.Expression<String> roomName, com.querydsl.core.types.Expression<java.time.LocalDateTime> checkInDate, com.querydsl.core.types.Expression<java.time.LocalDateTime> checkOutDate, com.querydsl.core.types.Expression<java.time.LocalTime> checkInTime, com.querydsl.core.types.Expression<java.time.LocalTime> checkoutTime, com.querydsl.core.types.Expression<String> personName, com.querydsl.core.types.Expression<Integer> peopleCount, com.querydsl.core.types.Expression<String> phoneNumber) {
        super(HostReservationReq.class, new Class<?>[]{long.class, com.oneline.shimpyo.domain.reservation.ReservationStatus.class, String.class, String.class, java.time.LocalDateTime.class, java.time.LocalDateTime.class, java.time.LocalTime.class, java.time.LocalTime.class, String.class, int.class, String.class}, reservationId, reservationStatus, roomImageUrl, roomName, checkInDate, checkOutDate, checkInTime, checkoutTime, personName, peopleCount, phoneNumber);
    }

}

