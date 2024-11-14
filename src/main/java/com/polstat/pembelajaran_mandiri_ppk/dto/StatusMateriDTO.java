package com.polstat.pembelajaran_mandiri_ppk.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class StatusMateriDTO {
    private Long id;
    private Long mahasiswaId;
    private Long pertemuanId;
    private String status;  // "Belum dipelajari" atau "Sudah dipelajari"
}
