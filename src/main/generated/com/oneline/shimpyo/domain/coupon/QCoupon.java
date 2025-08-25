package com.oneline.shimpyo.domain.coupon;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QCoupon is a Querydsl query type for Coupon
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QCoupon extends EntityPathBase<Coupon> {

    private static final long serialVersionUID = -1741868442L;

    public static final QCoupon coupon = new QCoupon("coupon");

    public final com.oneline.shimpyo.domain.base.QBaseEntity _super = new com.oneline.shimpyo.domain.base.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdDate = _super.createdDate;

    public final StringPath description = createString("description");

    public final NumberPath<Integer> discount = createNumber("discount", Integer.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final BooleanPath isActived = createBoolean("isActived");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> lastModifiedDate = _super.lastModifiedDate;

    public final StringPath name = createString("name");

    public final ListPath<com.oneline.shimpyo.domain.pay.PayMent, com.oneline.shimpyo.domain.pay.QPayMent> payMentList = this.<com.oneline.shimpyo.domain.pay.PayMent, com.oneline.shimpyo.domain.pay.QPayMent>createList("payMentList", com.oneline.shimpyo.domain.pay.PayMent.class, com.oneline.shimpyo.domain.pay.QPayMent.class, PathInits.DIRECT2);

    public final StringPath uuid = createString("uuid");

    public QCoupon(String variable) {
        super(Coupon.class, forVariable(variable));
    }

    public QCoupon(Path<? extends Coupon> path) {
        super(path.getType(), path.getMetadata());
    }

    public QCoupon(PathMetadata metadata) {
        super(Coupon.class, metadata);
    }

}

