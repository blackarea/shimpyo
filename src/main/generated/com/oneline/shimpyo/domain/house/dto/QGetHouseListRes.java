package com.oneline.shimpyo.domain.house.dto;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.ConstructorExpression;
import javax.annotation.processing.Generated;

/**
 * com.oneline.shimpyo.domain.house.dto.QGetHouseListRes is a Querydsl Projection type for GetHouseListRes
 */
@Generated("com.querydsl.codegen.DefaultProjectionSerializer")
public class QGetHouseListRes extends ConstructorExpression<GetHouseListRes> {

    private static final long serialVersionUID = 1413296051L;

    public QGetHouseListRes(com.querydsl.core.types.Expression<Long> houseId, com.querydsl.core.types.Expression<String> name, com.querydsl.core.types.Expression<com.oneline.shimpyo.domain.house.HouseType> type, com.querydsl.core.types.Expression<Integer> price, com.querydsl.core.types.Expression<String> sido, com.querydsl.core.types.Expression<String> sigungu, com.querydsl.core.types.Expression<Long> roomId, com.querydsl.core.types.Expression<Double> ratio, com.querydsl.core.types.Expression<Boolean> wished, com.querydsl.core.types.Expression<? extends java.util.List<String>> houseImages) {
        super(GetHouseListRes.class, new Class<?>[]{long.class, String.class, com.oneline.shimpyo.domain.house.HouseType.class, int.class, String.class, String.class, long.class, double.class, boolean.class, java.util.List.class}, houseId, name, type, price, sido, sigungu, roomId, ratio, wished, houseImages);
    }

    public QGetHouseListRes(com.querydsl.core.types.Expression<Long> houseId, com.querydsl.core.types.Expression<String> name, com.querydsl.core.types.Expression<com.oneline.shimpyo.domain.house.HouseType> type, com.querydsl.core.types.Expression<Integer> price, com.querydsl.core.types.Expression<String> sido, com.querydsl.core.types.Expression<String> sigungu, com.querydsl.core.types.Expression<Long> roomId, com.querydsl.core.types.Expression<Double> ratio, com.querydsl.core.types.Expression<? extends java.util.List<String>> houseImages) {
        super(GetHouseListRes.class, new Class<?>[]{long.class, String.class, com.oneline.shimpyo.domain.house.HouseType.class, int.class, String.class, String.class, long.class, double.class, java.util.List.class}, houseId, name, type, price, sido, sigungu, roomId, ratio, houseImages);
    }

}

