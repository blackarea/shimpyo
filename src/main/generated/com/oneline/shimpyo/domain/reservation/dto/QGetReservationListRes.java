package com.oneline.shimpyo.domain.reservation.dto;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.ConstructorExpression;
import javax.annotation.processing.Generated;

/**
 * com.oneline.shimpyo.domain.reservation.dto.QGetReservationListRes is a Querydsl Projection type for GetReservationListRes
 */
@Generated("com.querydsl.codegen.DefaultProjectionSerializer")
public class QGetReservationListRes extends ConstructorExpression<GetReservationListRes> {

    private static final long serialVersionUID = 1594283123L;

    public QGetReservationListRes(com.querydsl.core.types.Expression<Long> reservationId, com.querydsl.core.types.Expression<String> houseImageUrl, com.querydsl.core.types.Expression<String> houseName, com.querydsl.core.types.Expression<String> houseOwnerName, com.querydsl.core.types.Expression<com.oneline.shimpyo.domain.house.HouseType> houseType, com.querydsl.core.types.Expression<java.time.LocalDateTime> checkInDate, com.querydsl.core.types.Expression<java.time.LocalDateTime> checkOutDate, com.querydsl.core.types.Expression<java.time.LocalTime> checkInTime, com.querydsl.core.types.Expression<java.time.LocalTime> checkoutTime, com.querydsl.core.types.Expression<Double> lat, com.querydsl.core.types.Expression<Double> lng, com.querydsl.core.types.Expression<String> address, com.querydsl.core.types.Expression<com.oneline.shimpyo.domain.reservation.ReservationStatus> reservationStatus, com.querydsl.core.types.Expression<Long> reviewId) {
        super(GetReservationListRes.class, new Class<?>[]{long.class, String.class, String.class, String.class, com.oneline.shimpyo.domain.house.HouseType.class, java.time.LocalDateTime.class, java.time.LocalDateTime.class, java.time.LocalTime.class, java.time.LocalTime.class, double.class, double.class, String.class, com.oneline.shimpyo.domain.reservation.ReservationStatus.class, long.class}, reservationId, houseImageUrl, houseName, houseOwnerName, houseType, checkInDate, checkOutDate, checkInTime, checkoutTime, lat, lng, address, reservationStatus, reviewId);
    }

}

