package com.polstat.pembelajaran_mandiri_ppk.mapper;

import com.polstat.pembelajaran_mandiri_ppk.dto.MahasiswaDTO;
import com.polstat.pembelajaran_mandiri_ppk.entity.Mahasiswa;

public class MahasiswaMapper {
    public static MahasiswaDTO toDTO(Mahasiswa mahasiswa) {
        return MahasiswaDTO.builder()
                .userId(mahasiswa.getUserId())
                .nim(mahasiswa.getNim())
                .nama(mahasiswa.getNama())
                .kelas(mahasiswa.getKelas())
                .build();
    }

    public static Mahasiswa toEntity(MahasiswaDTO mahasiswaDTO) {
        return Mahasiswa.builder()
                .userId(mahasiswaDTO.getUserId())
                .nim(mahasiswaDTO.getNim())
                .nama(mahasiswaDTO.getNama())
                .kelas(mahasiswaDTO.getKelas())
                .build();
    }
}
