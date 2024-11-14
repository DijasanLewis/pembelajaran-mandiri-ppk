package com.polstat.pembelajaran_mandiri_ppk.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "praktikum")
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
@Builder
public class Praktikum {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "pertemuan_id", nullable = false)
    private Pertemuan pertemuan;

    @ManyToOne
    @JoinColumn(name = "mahasiswa_id", nullable = false)
    private Mahasiswa mahasiswa;

    private String linkPengumpulan;  // Link ke Google Drive untuk pengumpulan hasil praktikum
    private String statusPengumpulan;  // "Belum dikerjakan" atau "Sudah dikerjakan"
    private String statusPenilaian;  // "Belum Dinilai" atau "Sudah Dinilai"
    private Integer skor;
}
