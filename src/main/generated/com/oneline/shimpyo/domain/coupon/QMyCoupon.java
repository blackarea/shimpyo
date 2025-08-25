package com.oneline.shimpyo.domain.coupon;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QMyCoupon is a Querydsl query type for MyCoupon
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QMyCoupon extends EntityPathBase<MyCoupon> {

    private static final long serialVersionUID = 202812210L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QMyCoupon myCoupon = new QMyCoupon("myCoupon");

    public final com.oneline.shimpyo.domain.base.QBaseEntity _super = new com.oneline.shimpyo.domain.base.QBaseEntity(this);

    public final QCoupon coupon;

    public final QCouponId couponId;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdDate = _super.createdDate;

    public final DateTimePath<java.time.LocalDateTime> expiredDate = createDateTime("expiredDate", java.time.LocalDateTime.class);

    public final BooleanPath isUsed = createBoolean("isUsed");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> lastModifiedDate = _super.lastModifiedDate;

    public final com.oneline.shimpyo.domain.member.QMember member;

    public QMyCoupon(String variable) {
        this(MyCoupon.class, forVariable(variable), INITS);
    }

    public QMyCoupon(Path<? extends MyCoupon> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QMyCoupon(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QMyCoupon(PathMetadata metadata, PathInits inits) {
        this(MyCoupon.class, metadata, inits);
    }

    public QMyCoupon(Class<? extends MyCoupon> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.coupon = inits.isInitialized("coupon") ? new QCoupon(forProperty("coupon")) : null;
        this.couponId = inits.isInitialized("couponId") ? new QCouponId(forProperty("couponId")) : null;
        this.member = inits.isInitialized("member") ? new com.oneline.shimpyo.domain.member.QMember(forProperty("member"), inits.get("member")) : null;
    }

}

