package com.oneline.shimpyo.domain.wish;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QWishList is a Querydsl query type for WishList
 */
@Generated("com.querydsl.codegen.DefaultEmbeddableSerializer")
public class QWishList extends BeanPath<WishList> {

    private static final long serialVersionUID = -938306876L;

    public static final QWishList wishList = new QWishList("wishList");

    public final NumberPath<Long> house_id = createNumber("house_id", Long.class);

    public final NumberPath<Long> member_id = createNumber("member_id", Long.class);

    public QWishList(String variable) {
        super(WishList.class, forVariable(variable));
    }

    public QWishList(Path<? extends WishList> path) {
        super(path.getType(), path.getMetadata());
    }

    public QWishList(PathMetadata metadata) {
        super(WishList.class, metadata);
    }

}

