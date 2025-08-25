package com.oneline.shimpyo.domain.house;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QHouseImage is a Querydsl query type for HouseImage
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QHouseImage extends EntityPathBase<HouseImage> {

    private static final long serialVersionUID = -591884431L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QHouseImage houseImage = new QHouseImage("houseImage");

    public final com.oneline.shimpyo.domain.base.QBaseEntity _super = new com.oneline.shimpyo.domain.base.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdDate = _super.createdDate;

    public final QHouse house;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> lastModifiedDate = _super.lastModifiedDate;

    public final StringPath originalFileName = createString("originalFileName");

    public final StringPath savedURL = createString("savedURL");

    public QHouseImage(String variable) {
        this(HouseImage.class, forVariable(variable), INITS);
    }

    public QHouseImage(Path<? extends HouseImage> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QHouseImage(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QHouseImage(PathMetadata metadata, PathInits inits) {
        this(HouseImage.class, metadata, inits);
    }

    public QHouseImage(Class<? extends HouseImage> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.house = inits.isInitialized("house") ? new QHouse(forProperty("house"), inits.get("house")) : null;
    }

}

