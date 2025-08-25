package com.oneline.shimpyo.domain.pay;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QPayMent is a Querydsl query type for PayMent
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QPayMent extends EntityPathBase<PayMent> {

    private static final long serialVersionUID = 1260176408L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QPayMent payMent = new QPayMent("payMent");

    public final com.oneline.shimpyo.domain.base.QBaseEntity _super = new com.oneline.shimpyo.domain.base.QBaseEntity(this);

    public final com.oneline.shimpyo.domain.coupon.QCoupon coupon;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdDate = _super.createdDate;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath impUid = createString("impUid");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> lastModifiedDate = _super.lastModifiedDate;

    public final EnumPath<PayMethod> payMethod = createEnum("payMethod", PayMethod.class);

    public final EnumPath<PayStatus> payStatus = createEnum("payStatus", PayStatus.class);

    public final NumberPath<Integer> price = createNumber("price", Integer.class);

    public final NumberPath<Integer> remainPrice = createNumber("remainPrice", Integer.class);

    public final StringPath UUID = createString("UUID");

    public QPayMent(String variable) {
        this(PayMent.class, forVariable(variable), INITS);
    }

    public QPayMent(Path<? extends PayMent> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QPayMent(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QPayMent(PathMetadata metadata, PathInits inits) {
        this(PayMent.class, metadata, inits);
    }

    public QPayMent(Class<? extends PayMent> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.coupon = inits.isInitialized("coupon") ? new com.oneline.shimpyo.domain.coupon.QCoupon(forProperty("coupon")) : null;
    }

}

