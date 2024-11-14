package com.polstat.pembelajaran_mandiri_ppk.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "kuis")
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
@Builder
public class Kuis {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String judul;

    @Column(nullable = false)
    private String linkGoogleForm;  // Link ke Google Form untuk kuis
}

