package com.oneline.shimpyo.domain.house;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QHouse is a Querydsl query type for House
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QHouse extends EntityPathBase<House> {

    private static final long serialVersionUID = -1412194294L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QHouse house = new QHouse("house");

    public final com.oneline.shimpyo.domain.base.QBaseEntity _super = new com.oneline.shimpyo.domain.base.QBaseEntity(this);

    public final NumberPath<Double> avgRating = createNumber("avgRating", Double.class);

    public final StringPath contents = createString("contents");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdDate = _super.createdDate;

    public final QHouseAddress houseAddress;

    public final ListPath<HouseOptions, QHouseOptions> houseOptions = this.<HouseOptions, QHouseOptions>createList("houseOptions", HouseOptions.class, QHouseOptions.class, PathInits.DIRECT2);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final ListPath<HouseImage, QHouseImage> images = this.<HouseImage, QHouseImage>createList("images", HouseImage.class, QHouseImage.class, PathInits.DIRECT2);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> lastModifiedDate = _super.lastModifiedDate;

    public final com.oneline.shimpyo.domain.member.QMember member;

    public final StringPath name = createString("name");

    public final ListPath<com.oneline.shimpyo.domain.review.Review, com.oneline.shimpyo.domain.review.QReview> reviews = this.<com.oneline.shimpyo.domain.review.Review, com.oneline.shimpyo.domain.review.QReview>createList("reviews", com.oneline.shimpyo.domain.review.Review.class, com.oneline.shimpyo.domain.review.QReview.class, PathInits.DIRECT2);

    public final ListPath<com.oneline.shimpyo.domain.room.Room, com.oneline.shimpyo.domain.room.QRoom> rooms = this.<com.oneline.shimpyo.domain.room.Room, com.oneline.shimpyo.domain.room.QRoom>createList("rooms", com.oneline.shimpyo.domain.room.Room.class, com.oneline.shimpyo.domain.room.QRoom.class, PathInits.DIRECT2);

    public final EnumPath<HouseType> type = createEnum("type", HouseType.class);

    public final ListPath<com.oneline.shimpyo.domain.wish.Wish, com.oneline.shimpyo.domain.wish.QWish> wishList = this.<com.oneline.shimpyo.domain.wish.Wish, com.oneline.shimpyo.domain.wish.QWish>createList("wishList", com.oneline.shimpyo.domain.wish.Wish.class, com.oneline.shimpyo.domain.wish.QWish.class, PathInits.DIRECT2);

    public QHouse(String variable) {
        this(House.class, forVariable(variable), INITS);
    }

    public QHouse(Path<? extends House> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QHouse(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QHouse(PathMetadata metadata, PathInits inits) {
        this(House.class, metadata, inits);
    }

    public QHouse(Class<? extends House> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.houseAddress = inits.isInitialized("houseAddress") ? new QHouseAddress(forProperty("houseAddress"), inits.get("houseAddress")) : null;
        this.member = inits.isInitialized("member") ? new com.oneline.shimpyo.domain.member.QMember(forProperty("member"), inits.get("member")) : null;
    }

}

