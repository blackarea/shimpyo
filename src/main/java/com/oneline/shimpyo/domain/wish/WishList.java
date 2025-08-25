package com.oneline.shimpyo.domain.wish;

import lombok.*;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.io.Serializable;

@EqualsAndHashCode
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
@Builder
public class WishList implements Serializable {
    @Column(name = "member_id")
    private long member_id;

    @Column(name = "house_id")
    private long house_id;
}
