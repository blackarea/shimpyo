package com.oneline.shimpyo.domain.coupon;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QCouponId is a Querydsl query type for CouponId
 */
@Generated("com.querydsl.codegen.DefaultEmbeddableSerializer")
public class QCouponId extends BeanPath<CouponId> {

    private static final long serialVersionUID = 1101675041L;

    public static final QCouponId couponId = new QCouponId("couponId");

    public final NumberPath<Long> coupon_id = createNumber("coupon_id", Long.class);

    public final NumberPath<Long> member_id = createNumber("member_id", Long.class);

    public QCouponId(String variable) {
        super(CouponId.class, forVariable(variable));
    }

    public QCouponId(Path<? extends CouponId> path) {
        super(path.getType(), path.getMetadata());
    }

    public QCouponId(PathMetadata metadata) {
        super(CouponId.class, metadata);
    }

}

