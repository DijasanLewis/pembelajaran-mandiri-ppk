package com.polstat.pembelajaran_mandiri_ppk.repository;

import com.polstat.pembelajaran_mandiri_ppk.entity.Praktikum;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PraktikumRepository extends JpaRepository<Praktikum, Long> {
    List<Praktikum> findByMahasiswa_UserId(Long mahasiswaId);  // Query untuk mencari praktikum berdasarkan ID mahasiswa
}