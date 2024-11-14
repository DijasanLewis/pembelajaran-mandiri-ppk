package com.polstat.pembelajaran_mandiri_ppk.service;

import com.polstat.pembelajaran_mandiri_ppk.dto.PraktikumDTO;
import java.util.List;

public interface PraktikumService {
    PraktikumDTO submitPraktikum(Long mahasiswaId, PraktikumDTO praktikumDTO);  // Mahasiswa mengumpulkan praktikum
    PraktikumDTO evaluatePraktikum(Long praktikumId, Integer skor);  // Dosen memberikan nilai praktikum
    List<PraktikumDTO> getPraktikumByMahasiswa(Long mahasiswaId);  // Mendapatkan daftar praktikum mahasiswa
}
