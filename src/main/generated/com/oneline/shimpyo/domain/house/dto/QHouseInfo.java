package com.oneline.shimpyo.domain.house.dto;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.ConstructorExpression;
import javax.annotation.processing.Generated;

/**
 * com.oneline.shimpyo.domain.house.dto.QHouseInfo is a Querydsl Projection type for HouseInfo
 */
@Generated("com.querydsl.codegen.DefaultProjectionSerializer")
public class QHouseInfo extends ConstructorExpression<HouseInfo> {

    private static final long serialVersionUID = -695231095L;

    public QHouseInfo(com.querydsl.core.types.Expression<Long> houseId, com.querydsl.core.types.Expression<String> name, com.querydsl.core.types.Expression<com.oneline.shimpyo.domain.house.HouseType> type, com.querydsl.core.types.Expression<String> contents, com.querydsl.core.types.Expression<String> postCode, com.querydsl.core.types.Expression<String> sido, com.querydsl.core.types.Expression<String> sigungu, com.querydsl.core.types.Expression<String> fullAddress, com.querydsl.core.types.Expression<Double> lat, com.querydsl.core.types.Expression<Double> lng) {
        super(HouseInfo.class, new Class<?>[]{long.class, String.class, com.oneline.shimpyo.domain.house.HouseType.class, String.class, String.class, String.class, String.class, String.class, double.class, double.class}, houseId, name, type, contents, postCode, sido, sigungu, fullAddress, lat, lng);
    }

}

