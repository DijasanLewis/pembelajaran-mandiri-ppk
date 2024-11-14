package com.polstat.pembelajaran_mandiri_ppk.service;

import com.polstat.pembelajaran_mandiri_ppk.dto.PertemuanDTO;
import java.util.List;

public interface MateriService {
    PertemuanDTO addPertemuan(PertemuanDTO pertemuanDTO);  // Menambah materi baru
    List<PertemuanDTO> getAllPertemuan();  // Mendapatkan semua materi
    PertemuanDTO getPertemuanById(Long id);  // Mendapatkan materi berdasarkan ID
    PertemuanDTO updatePertemuan(Long id, PertemuanDTO pertemuanDTO);  // Mengupdate materi
    void deletePertemuan(Long id);  // Menghapus materi
}
