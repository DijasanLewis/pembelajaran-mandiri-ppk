package com.polstat.pembelajaran_mandiri_ppk.service;

import java.util.List;

import com.polstat.pembelajaran_mandiri_ppk.dto.KuisDTO;

public interface KuisService {
    KuisDTO addKuis(KuisDTO kuisDTO);  // Menambah kuis baru
    List<KuisDTO> getAllKuis();  // Mendapatkan semua kuis
    KuisDTO getKuisById(Long id);  // Mendapatkan kuis berdasarkan ID
    void updateKuisStatus(Long mahasiswaId, Long kuisId, String status);  // Mengupdate status pengerjaan kuis mahasiswa
}
