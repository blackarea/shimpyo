package com.oneline.shimpyo.domain.room.dto;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.ConstructorExpression;
import javax.annotation.processing.Generated;

/**
 * com.oneline.shimpyo.domain.room.dto.QRoomInfo is a Querydsl Projection type for RoomInfo
 */
@Generated("com.querydsl.codegen.DefaultProjectionSerializer")
public class QRoomInfo extends ConstructorExpression<RoomInfo> {

    private static final long serialVersionUID = 1108353283L;

    public QRoomInfo(com.querydsl.core.types.Expression<Long> roomId, com.querydsl.core.types.Expression<String> name, com.querydsl.core.types.Expression<Integer> price, com.querydsl.core.types.Expression<Integer> minPeople, com.querydsl.core.types.Expression<Integer> maxPeople, com.querydsl.core.types.Expression<Integer> bedCount, com.querydsl.core.types.Expression<Integer> bedroomCount, com.querydsl.core.types.Expression<Integer> bathroomCount, com.querydsl.core.types.Expression<Integer> totalCount, com.querydsl.core.types.Expression<java.time.LocalTime> checkIn, com.querydsl.core.types.Expression<java.time.LocalTime> checkOut) {
        super(RoomInfo.class, new Class<?>[]{long.class, String.class, int.class, int.class, int.class, int.class, int.class, int.class, int.class, java.time.LocalTime.class, java.time.LocalTime.class}, roomId, name, price, minPeople, maxPeople, bedCount, bedroomCount, bathroomCount, totalCount, checkIn, checkOut);
    }

}

