package com.polstat.pembelajaran_mandiri_ppk.mapper;

import com.polstat.pembelajaran_mandiri_ppk.dto.DosenDTO;
import com.polstat.pembelajaran_mandiri_ppk.entity.Dosen;

public class DosenMapper {
    public static DosenDTO toDTO(Dosen dosen) {
        return DosenDTO.builder()
                .userId(dosen.getUserId())
                .NIDN(dosen.getNIDN())
                .nama(dosen.getNama())
                .build();
    }

    public static Dosen toEntity(DosenDTO dosenDTO) {
        return Dosen.builder()
                .userId(dosenDTO.getUserId())
                .NIDN(dosenDTO.getNIDN())
                .nama(dosenDTO.getNama())
                .build();
    }
}
