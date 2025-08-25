package com.oneline.shimpyo.domain.house.dto;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.ConstructorExpression;
import javax.annotation.processing.Generated;

/**
 * com.oneline.shimpyo.domain.house.dto.QGetMyHouseListRes is a Querydsl Projection type for GetMyHouseListRes
 */
@Generated("com.querydsl.codegen.DefaultProjectionSerializer")
public class QGetMyHouseListRes extends ConstructorExpression<GetMyHouseListRes> {

    private static final long serialVersionUID = 1641332543L;

    public QGetMyHouseListRes(com.querydsl.core.types.Expression<Long> id, com.querydsl.core.types.Expression<String> name, com.querydsl.core.types.Expression<String> imageUrl, com.querydsl.core.types.Expression<com.oneline.shimpyo.domain.house.HouseType> houseType) {
        super(GetMyHouseListRes.class, new Class<?>[]{long.class, String.class, String.class, com.oneline.shimpyo.domain.house.HouseType.class}, id, name, imageUrl, houseType);
    }

}

