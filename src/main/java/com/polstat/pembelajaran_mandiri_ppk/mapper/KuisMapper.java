package com.polstat.pembelajaran_mandiri_ppk.mapper;

import com.polstat.pembelajaran_mandiri_ppk.dto.KuisDTO;
import com.polstat.pembelajaran_mandiri_ppk.entity.Kuis;

public class KuisMapper {
    public static KuisDTO toDTO(Kuis kuis) {
        return KuisDTO.builder()
                .id(kuis.getId())
                .judul(kuis.getJudul())
                .linkGoogleForm(kuis.getLinkGoogleForm())
                .build();
    }

    public static Kuis toEntity(KuisDTO kuisDTO) {
        return Kuis.builder()
                .id(kuisDTO.getId())
                .judul(kuisDTO.getJudul())
                .linkGoogleForm(kuisDTO.getLinkGoogleForm())
                .build();
    }
}
