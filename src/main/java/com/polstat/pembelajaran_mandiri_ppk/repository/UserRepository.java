package com.polstat.pembelajaran_mandiri_ppk.repository;

import com.polstat.pembelajaran_mandiri_ppk.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);  // Mencari user berdasarkan email
}
