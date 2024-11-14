package com.polstat.pembelajaran_mandiri_ppk.repository;

import com.polstat.pembelajaran_mandiri_ppk.entity.StatusKuis;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface StatusKuisRepository extends JpaRepository<StatusKuis, Long> {
    Optional<StatusKuis> findByMahasiswaIdAndKuisId(Long mahasiswaId, Long kuisId);
}
