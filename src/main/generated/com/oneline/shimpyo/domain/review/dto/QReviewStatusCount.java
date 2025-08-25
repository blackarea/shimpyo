package com.oneline.shimpyo.domain.review.dto;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.ConstructorExpression;
import javax.annotation.processing.Generated;

/**
 * com.oneline.shimpyo.domain.review.dto.QReviewStatusCount is a Querydsl Projection type for ReviewStatusCount
 */
@Generated("com.querydsl.codegen.DefaultProjectionSerializer")
public class QReviewStatusCount extends ConstructorExpression<ReviewStatusCount> {

    private static final long serialVersionUID = 1257736936L;

    public QReviewStatusCount(com.querydsl.core.types.Expression<com.oneline.shimpyo.domain.review.ReviewRating> reviewRating, com.querydsl.core.types.Expression<Long> reviewCount) {
        super(ReviewStatusCount.class, new Class<?>[]{com.oneline.shimpyo.domain.review.ReviewRating.class, long.class}, reviewRating, reviewCount);
    }

}

