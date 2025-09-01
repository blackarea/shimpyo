package com.oneline.shimpyo.domain.coupon;

import com.oneline.shimpyo.domain.base.BaseEntity;
import com.oneline.shimpyo.domain.pay.PayMent;
import lombok.*;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.util.ArrayList;
import java.util.List;

import static jakarta.persistence.CascadeType.*;
import static lombok.AccessLevel.PROTECTED;

@Builder
@AllArgsConstructor
@Entity
@Getter @Setter
@NoArgsConstructor(access = PROTECTED)
@Table(name = "COUPON")
public class Coupon extends BaseEntity {

    @Id @GeneratedValue
    @Column(name = "coupon_id")
    private Long id;

    @NotNull
    private String uuid;

    @NotNull
    private String name;

    @NotNull
    private String description;

    // 할인율
    @NotNull
    private int discount;
    
    //활성 유무
    @NotNull
    private boolean isActived;

    @OneToMany(mappedBy = "coupon", cascade = ALL)
    private List<PayMent> payMentList = new ArrayList<>();

}
