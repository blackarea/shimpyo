package com.oneline.shimpyo.domain.reservation;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QNonMemberReservation is a Querydsl query type for NonMemberReservation
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QNonMemberReservation extends EntityPathBase<NonMemberReservation> {

    private static final long serialVersionUID = -104168401L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QNonMemberReservation nonMemberReservation = new QNonMemberReservation("nonMemberReservation");

    public final com.oneline.shimpyo.domain.base.QBaseEntity _super = new com.oneline.shimpyo.domain.base.QBaseEntity(this);

    public final DateTimePath<java.time.LocalDateTime> checkInDate = createDateTime("checkInDate", java.time.LocalDateTime.class);

    public final DateTimePath<java.time.LocalDateTime> checkOutDate = createDateTime("checkOutDate", java.time.LocalDateTime.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdDate = _super.createdDate;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> lastModifiedDate = _super.lastModifiedDate;

    public final StringPath name = createString("name");

    public final com.oneline.shimpyo.domain.pay.QPayMent payMent;

    public final NumberPath<Integer> peopleCount = createNumber("peopleCount", Integer.class);

    public final StringPath phoneNumber = createString("phoneNumber");

    public final StringPath reservationCode = createString("reservationCode");

    public final EnumPath<ReservationStatus> reservationStatus = createEnum("reservationStatus", ReservationStatus.class);

    public final com.oneline.shimpyo.domain.room.QRoom room;

    public QNonMemberReservation(String variable) {
        this(NonMemberReservation.class, forVariable(variable), INITS);
    }

    public QNonMemberReservation(Path<? extends NonMemberReservation> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QNonMemberReservation(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QNonMemberReservation(PathMetadata metadata, PathInits inits) {
        this(NonMemberReservation.class, metadata, inits);
    }

    public QNonMemberReservation(Class<? extends NonMemberReservation> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.payMent = inits.isInitialized("payMent") ? new com.oneline.shimpyo.domain.pay.QPayMent(forProperty("payMent"), inits.get("payMent")) : null;
        this.room = inits.isInitialized("room") ? new com.oneline.shimpyo.domain.room.QRoom(forProperty("room"), inits.get("room")) : null;
    }

}

