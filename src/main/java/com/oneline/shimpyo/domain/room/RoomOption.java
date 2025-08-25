package com.oneline.shimpyo.domain.room;

import lombok.*;

import jakarta.persistence.Embeddable;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
@Getter @Setter
public class RoomOption {

    private int bedCount;

    private int bedroomCount;

    private int bathroomCount;
}
