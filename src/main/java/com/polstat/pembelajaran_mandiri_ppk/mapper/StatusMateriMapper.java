package com.polstat.pembelajaran_mandiri_ppk.mapper;

import com.polstat.pembelajaran_mandiri_ppk.dto.StatusMateriDTO;
import com.polstat.pembelajaran_mandiri_ppk.entity.StatusMateri;

public class StatusMateriMapper {
    public static StatusMateriDTO toDTO(StatusMateri statusMateri) {
        return StatusMateriDTO.builder()
                .id(statusMateri.getId())
                .mahasiswaId(statusMateri.getMahasiswa().getUserId())
                .pertemuanId(statusMateri.getPertemuan().getId())
                .status(statusMateri.getStatus())
                .build();
    }

    public static StatusMateri toEntity(StatusMateriDTO statusMateriDTO) {
        StatusMateri statusMateri = new StatusMateri();
        statusMateri.setId(statusMateriDTO.getId());
        statusMateri.setStatus(statusMateriDTO.getStatus());
        // Note: Mahasiswa dan Pertemuan perlu diambil dari repository saat mengonversi dari DTO ke Entity.
        return statusMateri;
    }
}
