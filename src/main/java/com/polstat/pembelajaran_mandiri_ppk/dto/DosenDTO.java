package com.polstat.pembelajaran_mandiri_ppk.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DosenDTO {
    private Long userId;
    private String NIDN;
    private String nama;
}
