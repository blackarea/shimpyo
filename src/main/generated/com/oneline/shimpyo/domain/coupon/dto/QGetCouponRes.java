package com.oneline.shimpyo.domain.coupon.dto;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.ConstructorExpression;
import javax.annotation.processing.Generated;

/**
 * com.oneline.shimpyo.domain.coupon.dto.QGetCouponRes is a Querydsl Projection type for GetCouponRes
 */
@Generated("com.querydsl.codegen.DefaultProjectionSerializer")
public class QGetCouponRes extends ConstructorExpression<GetCouponRes> {

    private static final long serialVersionUID = 448799187L;

    public QGetCouponRes(com.querydsl.core.types.Expression<Long> couponId, com.querydsl.core.types.Expression<String> name, com.querydsl.core.types.Expression<String> description, com.querydsl.core.types.Expression<Integer> discount, com.querydsl.core.types.Expression<java.time.LocalDateTime> expiredDate) {
        super(GetCouponRes.class, new Class<?>[]{long.class, String.class, String.class, int.class, java.time.LocalDateTime.class}, couponId, name, description, discount, expiredDate);
    }

}

