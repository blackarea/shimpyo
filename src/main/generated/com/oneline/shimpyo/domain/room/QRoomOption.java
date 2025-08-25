package com.oneline.shimpyo.domain.room;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QRoomOption is a Querydsl query type for RoomOption
 */
@Generated("com.querydsl.codegen.DefaultEmbeddableSerializer")
public class QRoomOption extends BeanPath<RoomOption> {

    private static final long serialVersionUID = 649468315L;

    public static final QRoomOption roomOption = new QRoomOption("roomOption");

    public final NumberPath<Integer> bathroomCount = createNumber("bathroomCount", Integer.class);

    public final NumberPath<Integer> bedCount = createNumber("bedCount", Integer.class);

    public final NumberPath<Integer> bedroomCount = createNumber("bedroomCount", Integer.class);

    public QRoomOption(String variable) {
        super(RoomOption.class, forVariable(variable));
    }

    public QRoomOption(Path<? extends RoomOption> path) {
        super(path.getType(), path.getMetadata());
    }

    public QRoomOption(PathMetadata metadata) {
        super(RoomOption.class, metadata);
    }

}

