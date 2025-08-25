package com.oneline.shimpyo.domain.review.dto;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.ConstructorExpression;
import javax.annotation.processing.Generated;

/**
 * com.oneline.shimpyo.domain.review.dto.QGetReviewRes is a Querydsl Projection type for GetReviewRes
 */
@Generated("com.querydsl.codegen.DefaultProjectionSerializer")
public class QGetReviewRes extends ConstructorExpression<GetReviewRes> {

    private static final long serialVersionUID = -1816770449L;

    public QGetReviewRes(com.querydsl.core.types.Expression<Long> reservationId, com.querydsl.core.types.Expression<Long> reviewId, com.querydsl.core.types.Expression<java.time.LocalDateTime> reviewCreatedDate, com.querydsl.core.types.Expression<java.time.LocalDateTime> reviewModifiedDate, com.querydsl.core.types.Expression<com.oneline.shimpyo.domain.review.ReviewRating> reviewRating, com.querydsl.core.types.Expression<String> contents) {
        super(GetReviewRes.class, new Class<?>[]{long.class, long.class, java.time.LocalDateTime.class, java.time.LocalDateTime.class, com.oneline.shimpyo.domain.review.ReviewRating.class, String.class}, reservationId, reviewId, reviewCreatedDate, reviewModifiedDate, reviewRating, contents);
    }

}

