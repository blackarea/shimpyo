package com.oneline.shimpyo.domain.review.dto;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.ConstructorExpression;
import javax.annotation.processing.Generated;

/**
 * com.oneline.shimpyo.domain.review.dto.QGetHouseReviewListRes_Review is a Querydsl Projection type for Review
 */
@Generated("com.querydsl.codegen.DefaultProjectionSerializer")
public class QGetHouseReviewListRes_Review extends ConstructorExpression<GetHouseReviewListRes.Review> {

    private static final long serialVersionUID = -1969299261L;

    public QGetHouseReviewListRes_Review(com.querydsl.core.types.Expression<Long> reviewId, com.querydsl.core.types.Expression<String> name, com.querydsl.core.types.Expression<String> imageUrl, com.querydsl.core.types.Expression<java.time.LocalDateTime> reviewCreatedDate, com.querydsl.core.types.Expression<java.time.LocalDateTime> reviewModifiedDate, com.querydsl.core.types.Expression<com.oneline.shimpyo.domain.review.ReviewRating> reviewRating, com.querydsl.core.types.Expression<String> contents) {
        super(GetHouseReviewListRes.Review.class, new Class<?>[]{long.class, String.class, String.class, java.time.LocalDateTime.class, java.time.LocalDateTime.class, com.oneline.shimpyo.domain.review.ReviewRating.class, String.class}, reviewId, name, imageUrl, reviewCreatedDate, reviewModifiedDate, reviewRating, contents);
    }

}

