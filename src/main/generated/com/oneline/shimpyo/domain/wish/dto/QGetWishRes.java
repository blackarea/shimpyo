package com.oneline.shimpyo.domain.wish.dto;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.ConstructorExpression;
import javax.annotation.processing.Generated;

/**
 * com.oneline.shimpyo.domain.wish.dto.QGetWishRes is a Querydsl Projection type for GetWishRes
 */
@Generated("com.querydsl.codegen.DefaultProjectionSerializer")
public class QGetWishRes extends ConstructorExpression<GetWishRes> {

    private static final long serialVersionUID = -1427287215L;

    public QGetWishRes(com.querydsl.core.types.Expression<Long> houseId, com.querydsl.core.types.Expression<String> houseName, com.querydsl.core.types.Expression<com.oneline.shimpyo.domain.house.HouseType> houseType, com.querydsl.core.types.Expression<String> houseImage) {
        super(GetWishRes.class, new Class<?>[]{long.class, String.class, com.oneline.shimpyo.domain.house.HouseType.class, String.class}, houseId, houseName, houseType, houseImage);
    }

}

