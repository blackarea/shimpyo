package com.oneline.shimpyo.domain.member.dto;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.ConstructorExpression;
import javax.annotation.processing.Generated;

/**
 * com.oneline.shimpyo.domain.member.dto.QMemberProfileRes is a Querydsl Projection type for MemberProfileRes
 */
@Generated("com.querydsl.codegen.DefaultProjectionSerializer")
public class QMemberProfileRes extends ConstructorExpression<MemberProfileRes> {

    private static final long serialVersionUID = -1017648916L;

    public QMemberProfileRes(com.querydsl.core.types.Expression<String> profileImage, com.querydsl.core.types.Expression<String> selfIntroduce, com.querydsl.core.types.Expression<Long> id, com.querydsl.core.types.Expression<String> nickname) {
        super(MemberProfileRes.class, new Class<?>[]{String.class, String.class, long.class, String.class}, profileImage, selfIntroduce, id, nickname);
    }

}

