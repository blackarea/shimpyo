package com.oneline.shimpyo.domain.member;

import com.oneline.shimpyo.domain.base.BaseEntity;
import lombok.*;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import static jakarta.persistence.FetchType.LAZY;
import static lombok.AccessLevel.*;

@Builder
@AllArgsConstructor
@Entity
@Getter @Setter
@NoArgsConstructor(access = PROTECTED)
@Table(name = "MEMBER_IMAGE")
public class MemberImage extends BaseEntity {

    @Id @GeneratedValue
    @Column(name = "member_image_id")
    private Long id;

    @NotNull
    @OneToOne(fetch = LAZY)
    @JoinColumn(name = "member_id")
    private Member member;

    @NotNull
    private String originalFileName;
    @NotNull
    private String savedFileName;
    @NotNull
    private String savedPath;
    @NotNull
    private boolean thumbnail;

}
