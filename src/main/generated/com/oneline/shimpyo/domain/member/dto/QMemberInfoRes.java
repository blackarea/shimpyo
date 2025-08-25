package com.oneline.shimpyo.domain.member.dto;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.ConstructorExpression;
import javax.annotation.processing.Generated;

/**
 * com.oneline.shimpyo.domain.member.dto.QMemberInfoRes is a Querydsl Projection type for MemberInfoRes
 */
@Generated("com.querydsl.codegen.DefaultProjectionSerializer")
public class QMemberInfoRes extends ConstructorExpression<MemberInfoRes> {

    private static final long serialVersionUID = 2070542973L;

    public QMemberInfoRes(com.querydsl.core.types.Expression<String> nickname, com.querydsl.core.types.Expression<String> email, com.querydsl.core.types.Expression<String> phoneNumber, com.querydsl.core.types.Expression<Long> userId) {
        super(MemberInfoRes.class, new Class<?>[]{String.class, String.class, String.class, long.class}, nickname, email, phoneNumber, userId);
    }

}

