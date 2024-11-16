package com.polstat.pembelajaran_mandiri_ppk.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.polstat.pembelajaran_mandiri_ppk.entity.StatusKuis;

public interface StatusKuisRepository extends JpaRepository<StatusKuis, Long> {
    Optional<StatusKuis> findByMahasiswaUserIdAndKuisId(Long mahasiswaUserId, Long kuisId);
}

