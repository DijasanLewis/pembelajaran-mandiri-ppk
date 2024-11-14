package com.polstat.pembelajaran_mandiri_ppk.mapper;

import com.polstat.pembelajaran_mandiri_ppk.dto.PertemuanDTO;
import com.polstat.pembelajaran_mandiri_ppk.entity.Pertemuan;

public class PertemuanMapper {
    public static PertemuanDTO toDTO(Pertemuan pertemuan) {
        return PertemuanDTO.builder()
                .id(pertemuan.getId())
                .judul(pertemuan.getJudul())
                .linkMateri(pertemuan.getLinkMateri())
                .linkModulPraktikum(pertemuan.getLinkModulPraktikum())
                .build();
    }

    public static Pertemuan toEntity(PertemuanDTO pertemuanDTO) {
        return Pertemuan.builder()
                .id(pertemuanDTO.getId())
                .judul(pertemuanDTO.getJudul())
                .linkMateri(pertemuanDTO.getLinkMateri())
                .linkModulPraktikum(pertemuanDTO.getLinkModulPraktikum())
                .build();
    }
}
