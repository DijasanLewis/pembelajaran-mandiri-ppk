package com.polstat.pembelajaran_mandiri_ppk.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class KuisDTO {
    private Long id;
    private String judul;
    private String linkGoogleForm;
}
