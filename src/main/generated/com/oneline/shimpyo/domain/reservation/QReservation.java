package com.oneline.shimpyo.domain.reservation;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QReservation is a Querydsl query type for Reservation
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QReservation extends EntityPathBase<Reservation> {

    private static final long serialVersionUID = -1387184670L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QReservation reservation = new QReservation("reservation");

    public final com.oneline.shimpyo.domain.base.QBaseEntity _super = new com.oneline.shimpyo.domain.base.QBaseEntity(this);

    public final DateTimePath<java.time.LocalDateTime> checkInDate = createDateTime("checkInDate", java.time.LocalDateTime.class);

    public final DateTimePath<java.time.LocalDateTime> checkOutDate = createDateTime("checkOutDate", java.time.LocalDateTime.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdDate = _super.createdDate;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> lastModifiedDate = _super.lastModifiedDate;

    public final com.oneline.shimpyo.domain.member.QMember member;

    public final com.oneline.shimpyo.domain.pay.QPayMent payMent;

    public final NumberPath<Integer> peopleCount = createNumber("peopleCount", Integer.class);

    public final StringPath phoneNumber = createString("phoneNumber");

    public final EnumPath<ReservationStatus> reservationStatus = createEnum("reservationStatus", ReservationStatus.class);

    public final com.oneline.shimpyo.domain.review.QReview review;

    public final com.oneline.shimpyo.domain.room.QRoom room;

    public QReservation(String variable) {
        this(Reservation.class, forVariable(variable), INITS);
    }

    public QReservation(Path<? extends Reservation> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QReservation(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QReservation(PathMetadata metadata, PathInits inits) {
        this(Reservation.class, metadata, inits);
    }

    public QReservation(Class<? extends Reservation> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.member = inits.isInitialized("member") ? new com.oneline.shimpyo.domain.member.QMember(forProperty("member"), inits.get("member")) : null;
        this.payMent = inits.isInitialized("payMent") ? new com.oneline.shimpyo.domain.pay.QPayMent(forProperty("payMent"), inits.get("payMent")) : null;
        this.review = inits.isInitialized("review") ? new com.oneline.shimpyo.domain.review.QReview(forProperty("review"), inits.get("review")) : null;
        this.room = inits.isInitialized("room") ? new com.oneline.shimpyo.domain.room.QRoom(forProperty("room"), inits.get("room")) : null;
    }

}

