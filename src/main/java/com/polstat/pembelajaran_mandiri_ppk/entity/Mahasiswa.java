package com.polstat.pembelajaran_mandiri_ppk.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "mahasiswa")
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
@Builder
public class Mahasiswa {
    @Id
    private Long userId; // ID yang mengacu ke tabel User

    @OneToOne
    @MapsId
    @JoinColumn(name = "user_id")
    private User user;

    @Column(nullable = false)
    private String nim;

    @Column(nullable = false)
    private String nama;

    @Column(nullable = false)
    private String kelas;
}