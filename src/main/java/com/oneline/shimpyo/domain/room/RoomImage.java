package com.oneline.shimpyo.domain.room;

import com.oneline.shimpyo.domain.base.BaseEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import static jakarta.persistence.FetchType.LAZY;
import static lombok.AccessLevel.PROTECTED;

@Entity
@Getter @Setter
@NoArgsConstructor(access = PROTECTED)
@Table(name = "ROOM_IMAGE")
public class RoomImage extends BaseEntity {
    @Id @GeneratedValue
    private Long id;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "room_id")
    private Room room;

    @NotNull
    private String originalFileName;
    @NotNull
    @Column(name = "saved_url")
    private String savedURL;

    @Builder
    public RoomImage(Long id, Room room, String originalFileName, String savedURL) {
        this.id = id;
        this.room = room;
        this.originalFileName = originalFileName;
        this.savedURL = savedURL;
    }
}
