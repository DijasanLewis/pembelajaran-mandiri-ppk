package com.polstat.pembelajaran_mandiri_ppk.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MahasiswaDTO {
    private Long userId;
    private String nim;
    private String nama;
    private String kelas;
}
