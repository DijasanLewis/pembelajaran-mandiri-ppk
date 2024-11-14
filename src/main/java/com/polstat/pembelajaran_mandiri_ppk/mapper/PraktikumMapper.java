package com.polstat.pembelajaran_mandiri_ppk.mapper;

import com.polstat.pembelajaran_mandiri_ppk.dto.PraktikumDTO;
import com.polstat.pembelajaran_mandiri_ppk.entity.Praktikum;

public class PraktikumMapper {
    public static PraktikumDTO toDTO(Praktikum praktikum) {
        return PraktikumDTO.builder()
                .id(praktikum.getId())
                .pertemuanId(praktikum.getPertemuan().getId())
                .mahasiswaId(praktikum.getMahasiswa().getUserId())
                .linkPengumpulan(praktikum.getLinkPengumpulan())
                .statusPengumpulan(praktikum.getStatusPengumpulan())
                .statusPenilaian(praktikum.getStatusPenilaian())
                .skor(praktikum.getSkor())
                .build();
    }

    public static Praktikum toEntity(PraktikumDTO praktikumDTO) {
        Praktikum praktikum = new Praktikum();
        praktikum.setId(praktikumDTO.getId());
        praktikum.setLinkPengumpulan(praktikumDTO.getLinkPengumpulan());
        praktikum.setStatusPengumpulan(praktikumDTO.getStatusPengumpulan());
        praktikum.setStatusPenilaian(praktikumDTO.getStatusPenilaian());
        praktikum.setSkor(praktikumDTO.getSkor());
        // Note: Pertemuan dan Mahasiswa perlu diambil dari repository saat mengonversi dari DTO ke Entity.
        return praktikum;
    }
}
