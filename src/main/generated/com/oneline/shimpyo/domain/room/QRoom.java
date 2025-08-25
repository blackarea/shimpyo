package com.oneline.shimpyo.domain.room;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QRoom is a Querydsl query type for Room
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QRoom extends EntityPathBase<Room> {

    private static final long serialVersionUID = 1485857158L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QRoom room = new QRoom("room");

    public final com.oneline.shimpyo.domain.base.QBaseEntity _super = new com.oneline.shimpyo.domain.base.QBaseEntity(this);

    public final NumberPath<Integer> bathroomCount = createNumber("bathroomCount", Integer.class);

    public final NumberPath<Integer> bedCount = createNumber("bedCount", Integer.class);

    public final NumberPath<Integer> bedroomCount = createNumber("bedroomCount", Integer.class);

    public final TimePath<java.time.LocalTime> checkIn = createTime("checkIn", java.time.LocalTime.class);

    public final TimePath<java.time.LocalTime> checkOut = createTime("checkOut", java.time.LocalTime.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdDate = _super.createdDate;

    public final com.oneline.shimpyo.domain.house.QHouse house;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final ListPath<RoomImage, QRoomImage> images = this.<RoomImage, QRoomImage>createList("images", RoomImage.class, QRoomImage.class, PathInits.DIRECT2);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> lastModifiedDate = _super.lastModifiedDate;

    public final NumberPath<Integer> maxPeople = createNumber("maxPeople", Integer.class);

    public final NumberPath<Integer> minPeople = createNumber("minPeople", Integer.class);

    public final StringPath name = createString("name");

    public final ListPath<com.oneline.shimpyo.domain.reservation.NonMemberReservation, com.oneline.shimpyo.domain.reservation.QNonMemberReservation> nonMemberReservations = this.<com.oneline.shimpyo.domain.reservation.NonMemberReservation, com.oneline.shimpyo.domain.reservation.QNonMemberReservation>createList("nonMemberReservations", com.oneline.shimpyo.domain.reservation.NonMemberReservation.class, com.oneline.shimpyo.domain.reservation.QNonMemberReservation.class, PathInits.DIRECT2);

    public final NumberPath<Integer> price = createNumber("price", Integer.class);

    public final ListPath<com.oneline.shimpyo.domain.reservation.Reservation, com.oneline.shimpyo.domain.reservation.QReservation> reservations = this.<com.oneline.shimpyo.domain.reservation.Reservation, com.oneline.shimpyo.domain.reservation.QReservation>createList("reservations", com.oneline.shimpyo.domain.reservation.Reservation.class, com.oneline.shimpyo.domain.reservation.QReservation.class, PathInits.DIRECT2);

    public final NumberPath<Integer> totalCount = createNumber("totalCount", Integer.class);

    public final NumberPath<Long> version = createNumber("version", Long.class);

    public QRoom(String variable) {
        this(Room.class, forVariable(variable), INITS);
    }

    public QRoom(Path<? extends Room> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QRoom(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QRoom(PathMetadata metadata, PathInits inits) {
        this(Room.class, metadata, inits);
    }

    public QRoom(Class<? extends Room> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.house = inits.isInitialized("house") ? new com.oneline.shimpyo.domain.house.QHouse(forProperty("house"), inits.get("house")) : null;
    }

}

