package com.polstat.pembelajaran_mandiri_ppk.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserDTO {
    private Long id;
    private String email;
    private String role;  // "Mahasiswa" atau "Dosen"
}
