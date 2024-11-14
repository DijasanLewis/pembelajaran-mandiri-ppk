package com.polstat.pembelajaran_mandiri_ppk.mapper;

import com.polstat.pembelajaran_mandiri_ppk.dto.StatusKuisDTO;
import com.polstat.pembelajaran_mandiri_ppk.entity.StatusKuis;

public class StatusKuisMapper {
    public static StatusKuisDTO toDTO(StatusKuis statusKuis) {
        return StatusKuisDTO.builder()
                .id(statusKuis.getId())
                .mahasiswaId(statusKuis.getMahasiswa().getUserId())
                .kuisId(statusKuis.getKuis().getId())
                .status(statusKuis.getStatus())
                .build();
    }

    public static StatusKuis toEntity(StatusKuisDTO statusKuisDTO) {
        StatusKuis statusKuis = new StatusKuis();
        statusKuis.setId(statusKuisDTO.getId());
        statusKuis.setStatus(statusKuisDTO.getStatus());
        // Note: Mahasiswa dan Kuis perlu diambil dari repository saat mengonversi dari DTO ke Entity.
        return statusKuis;
    }
}
