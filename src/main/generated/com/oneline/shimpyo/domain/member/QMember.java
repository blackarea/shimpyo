package com.oneline.shimpyo.domain.member;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QMember is a Querydsl query type for Member
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QMember extends EntityPathBase<Member> {

    private static final long serialVersionUID = 2122926054L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QMember member = new QMember("member1");

    public final com.oneline.shimpyo.domain.base.QBaseEntity _super = new com.oneline.shimpyo.domain.base.QBaseEntity(this);

    public final StringPath comments = createString("comments");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdDate = _super.createdDate;

    public final StringPath email = createString("email");

    public final ListPath<com.oneline.shimpyo.domain.house.House, com.oneline.shimpyo.domain.house.QHouse> houseList = this.<com.oneline.shimpyo.domain.house.House, com.oneline.shimpyo.domain.house.QHouse>createList("houseList", com.oneline.shimpyo.domain.house.House.class, com.oneline.shimpyo.domain.house.QHouse.class, PathInits.DIRECT2);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> lastModifiedDate = _super.lastModifiedDate;

    public final QMemberGrade memberGrade;

    public final QMemberImage memberImage;

    public final ListPath<com.oneline.shimpyo.domain.coupon.MyCoupon, com.oneline.shimpyo.domain.coupon.QMyCoupon> myCoupons = this.<com.oneline.shimpyo.domain.coupon.MyCoupon, com.oneline.shimpyo.domain.coupon.QMyCoupon>createList("myCoupons", com.oneline.shimpyo.domain.coupon.MyCoupon.class, com.oneline.shimpyo.domain.coupon.QMyCoupon.class, PathInits.DIRECT2);

    public final StringPath nickname = createString("nickname");

    public final StringPath password = createString("password");

    public final StringPath phoneNumber = createString("phoneNumber");

    public final NumberPath<Integer> point = createNumber("point", Integer.class);

    public final StringPath provider = createString("provider");

    public final StringPath providerId = createString("providerId");

    public final StringPath refreshToken = createString("refreshToken");

    public final ListPath<com.oneline.shimpyo.domain.reservation.Reservation, com.oneline.shimpyo.domain.reservation.QReservation> reservations = this.<com.oneline.shimpyo.domain.reservation.Reservation, com.oneline.shimpyo.domain.reservation.QReservation>createList("reservations", com.oneline.shimpyo.domain.reservation.Reservation.class, com.oneline.shimpyo.domain.reservation.QReservation.class, PathInits.DIRECT2);

    public final ListPath<com.oneline.shimpyo.domain.review.Review, com.oneline.shimpyo.domain.review.QReview> reviews = this.<com.oneline.shimpyo.domain.review.Review, com.oneline.shimpyo.domain.review.QReview>createList("reviews", com.oneline.shimpyo.domain.review.Review.class, com.oneline.shimpyo.domain.review.QReview.class, PathInits.DIRECT2);

    public final EnumPath<MemberRole> role = createEnum("role", MemberRole.class);

    public final BooleanPath social = createBoolean("social");

    public final ListPath<com.oneline.shimpyo.domain.wish.Wish, com.oneline.shimpyo.domain.wish.QWish> wishList = this.<com.oneline.shimpyo.domain.wish.Wish, com.oneline.shimpyo.domain.wish.QWish>createList("wishList", com.oneline.shimpyo.domain.wish.Wish.class, com.oneline.shimpyo.domain.wish.QWish.class, PathInits.DIRECT2);

    public QMember(String variable) {
        this(Member.class, forVariable(variable), INITS);
    }

    public QMember(Path<? extends Member> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QMember(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QMember(PathMetadata metadata, PathInits inits) {
        this(Member.class, metadata, inits);
    }

    public QMember(Class<? extends Member> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.memberGrade = inits.isInitialized("memberGrade") ? new QMemberGrade(forProperty("memberGrade")) : null;
        this.memberImage = inits.isInitialized("memberImage") ? new QMemberImage(forProperty("memberImage"), inits.get("memberImage")) : null;
    }

}

