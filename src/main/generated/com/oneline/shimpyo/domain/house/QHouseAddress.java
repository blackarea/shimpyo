package com.oneline.shimpyo.domain.house;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QHouseAddress is a Querydsl query type for HouseAddress
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QHouseAddress extends EntityPathBase<HouseAddress> {

    private static final long serialVersionUID = -629910390L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QHouseAddress houseAddress = new QHouseAddress("houseAddress");

    public final com.oneline.shimpyo.domain.base.QBaseEntity _super = new com.oneline.shimpyo.domain.base.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdDate = _super.createdDate;

    public final StringPath fullAddress = createString("fullAddress");

    public final QHouse house;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> lastModifiedDate = _super.lastModifiedDate;

    public final NumberPath<Double> lat = createNumber("lat", Double.class);

    public final NumberPath<Double> lng = createNumber("lng", Double.class);

    public final StringPath postCode = createString("postCode");

    public final StringPath sido = createString("sido");

    public final StringPath sigungu = createString("sigungu");

    public QHouseAddress(String variable) {
        this(HouseAddress.class, forVariable(variable), INITS);
    }

    public QHouseAddress(Path<? extends HouseAddress> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QHouseAddress(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QHouseAddress(PathMetadata metadata, PathInits inits) {
        this(HouseAddress.class, metadata, inits);
    }

    public QHouseAddress(Class<? extends HouseAddress> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.house = inits.isInitialized("house") ? new QHouse(forProperty("house"), inits.get("house")) : null;
    }

}

