package com.oneline.shimpyo.domain.house;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QHouseOptions is a Querydsl query type for HouseOptions
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QHouseOptions extends EntityPathBase<HouseOptions> {

    private static final long serialVersionUID = -731693260L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QHouseOptions houseOptions = new QHouseOptions("houseOptions");

    public final com.oneline.shimpyo.domain.base.QBaseEntity _super = new com.oneline.shimpyo.domain.base.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdDate = _super.createdDate;

    public final QHouse house;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> lastModifiedDate = _super.lastModifiedDate;

    public final StringPath name = createString("name");

    public QHouseOptions(String variable) {
        this(HouseOptions.class, forVariable(variable), INITS);
    }

    public QHouseOptions(Path<? extends HouseOptions> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QHouseOptions(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QHouseOptions(PathMetadata metadata, PathInits inits) {
        this(HouseOptions.class, metadata, inits);
    }

    public QHouseOptions(Class<? extends HouseOptions> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.house = inits.isInitialized("house") ? new QHouse(forProperty("house"), inits.get("house")) : null;
    }

}

