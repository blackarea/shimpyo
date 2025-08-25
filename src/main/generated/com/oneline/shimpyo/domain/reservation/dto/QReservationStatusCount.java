package com.oneline.shimpyo.domain.reservation.dto;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.ConstructorExpression;
import javax.annotation.processing.Generated;

/**
 * com.oneline.shimpyo.domain.reservation.dto.QReservationStatusCount is a Querydsl Projection type for ReservationStatusCount
 */
@Generated("com.querydsl.codegen.DefaultProjectionSerializer")
public class QReservationStatusCount extends ConstructorExpression<ReservationStatusCount> {

    private static final long serialVersionUID = 1254868202L;

    public QReservationStatusCount(com.querydsl.core.types.Expression<com.oneline.shimpyo.domain.reservation.ReservationStatus> reservationStatus, com.querydsl.core.types.Expression<Long> count) {
        super(ReservationStatusCount.class, new Class<?>[]{com.oneline.shimpyo.domain.reservation.ReservationStatus.class, long.class}, reservationStatus, count);
    }

}

