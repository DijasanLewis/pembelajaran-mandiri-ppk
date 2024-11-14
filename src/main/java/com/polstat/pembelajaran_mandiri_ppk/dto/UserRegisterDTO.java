package com.polstat.pembelajaran_mandiri_ppk.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserRegisterDTO {
    private String email;
    private String password;
    private String role;  // "Mahasiswa" atau "Dosen"
}
