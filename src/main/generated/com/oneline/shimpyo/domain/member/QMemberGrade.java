package com.oneline.shimpyo.domain.member;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QMemberGrade is a Querydsl query type for MemberGrade
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QMemberGrade extends EntityPathBase<MemberGrade> {

    private static final long serialVersionUID = -473725039L;

    public static final QMemberGrade memberGrade = new QMemberGrade("memberGrade");

    public final NumberPath<Integer> discount = createNumber("discount", Integer.class);

    public final EnumPath<GradeName> grade = createEnum("grade", GradeName.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final ListPath<Member, QMember> members = this.<Member, QMember>createList("members", Member.class, QMember.class, PathInits.DIRECT2);

    public QMemberGrade(String variable) {
        super(MemberGrade.class, forVariable(variable));
    }

    public QMemberGrade(Path<? extends MemberGrade> path) {
        super(path.getType(), path.getMetadata());
    }

    public QMemberGrade(PathMetadata metadata) {
        super(MemberGrade.class, metadata);
    }

}

