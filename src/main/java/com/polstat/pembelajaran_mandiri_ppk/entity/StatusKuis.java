package com.polstat.pembelajaran_mandiri_ppk.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "status_kuis")
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
@Builder
public class StatusKuis {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "mahasiswa_id", nullable = false)
    private Mahasiswa mahasiswa;

    @ManyToOne
    @JoinColumn(name = "kuis_id", nullable = false)
    private Kuis kuis;

    @Column(nullable = false)
    private String status;  // "Belum Dikerjakan" atau "Sudah Dikerjakan"
}
