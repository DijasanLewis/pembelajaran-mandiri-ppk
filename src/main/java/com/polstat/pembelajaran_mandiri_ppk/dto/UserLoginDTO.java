package com.polstat.pembelajaran_mandiri_ppk.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserLoginDTO {
    private String email;
    private String password;
}
