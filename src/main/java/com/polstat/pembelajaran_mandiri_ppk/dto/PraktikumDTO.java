package com.polstat.pembelajaran_mandiri_ppk.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PraktikumDTO {
    private Long id;
    private Long pertemuanId;
    private Long mahasiswaId;
    private String linkPengumpulan;
    private String statusPengumpulan;  // "Belum dikerjakan" atau "Sudah dikerjakan"
    private String statusPenilaian;  // "Belum Dinilai" atau "Sudah Dinilai"
    private Integer skor;
}
