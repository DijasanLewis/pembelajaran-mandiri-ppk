package com.polstat.pembelajaran_mandiri_ppk.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "dosen")
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
@Builder
public class Dosen {
    @Id
    private Long userId; // ID yang mengacu ke tabel User

    @OneToOne
    @MapsId
    @JoinColumn(name = "user_id")
    private User user;

    @Column(nullable = false)
    private String NIDN;

    @Column(nullable = false)
    private String nama;
}