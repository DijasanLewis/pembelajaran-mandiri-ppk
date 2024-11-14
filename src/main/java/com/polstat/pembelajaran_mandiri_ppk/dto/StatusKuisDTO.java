// StatusKuisDTO.java
package com.polstat.pembelajaran_mandiri_ppk.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class StatusKuisDTO {
    private Long id;
    private Long mahasiswaId;
    private Long kuisId;
    private String status;  // "Belum Dikerjakan" atau "Sudah Dikerjakan"
}
