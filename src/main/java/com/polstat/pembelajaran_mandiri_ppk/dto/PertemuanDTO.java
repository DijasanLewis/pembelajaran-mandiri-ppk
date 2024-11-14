package com.polstat.pembelajaran_mandiri_ppk.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PertemuanDTO {
    private Long id;
    private String judul;
    private String linkMateri;
    private String linkModulPraktikum;
}
