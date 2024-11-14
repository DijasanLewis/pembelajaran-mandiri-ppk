package com.polstat.pembelajaran_mandiri_ppk.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "pertemuan")
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
@Builder
public class Pertemuan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String judul;

    private String linkMateri;  // Link ke Google Drive untuk materi
    private String linkModulPraktikum;  // Link ke Google Drive untuk modul praktikum
}
