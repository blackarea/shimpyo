package com.oneline.shimpyo.domain.coupon;

import com.oneline.shimpyo.domain.base.BaseEntity;
import com.oneline.shimpyo.domain.member.Member;
import lombok.*;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import java.time.LocalDateTime;

import static jakarta.persistence.FetchType.LAZY;
import static lombok.AccessLevel.PROTECTED;

@Builder
@AllArgsConstructor
@Entity
@Getter @Setter
@NoArgsConstructor(access = PROTECTED)
@Table(name = "MY_COUPON")
public class MyCoupon extends BaseEntity {

    @MapsId("member_id")
    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "member_id")
    private Member member;

    @MapsId("coupon_id")
    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "coupon_id")
    private Coupon coupon;

    @EmbeddedId
    private CouponId couponId;

    //만료일
    @NotNull
    private LocalDateTime expiredDate;

    //사용여부
    @NotNull
    private boolean isUsed;
}
