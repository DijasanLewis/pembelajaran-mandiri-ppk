package com.polstat.pembelajaran_mandiri_ppk.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "status_materi")
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
@Builder
public class StatusMateri {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "mahasiswa_id", nullable = false)
    private Mahasiswa mahasiswa;

    @ManyToOne
    @JoinColumn(name = "pertemuan_id", nullable = false)
    private Pertemuan pertemuan;

    @Column(nullable = false)
    private String status;  // "Belum dipelajari" atau "Sudah dipelajari"
}
