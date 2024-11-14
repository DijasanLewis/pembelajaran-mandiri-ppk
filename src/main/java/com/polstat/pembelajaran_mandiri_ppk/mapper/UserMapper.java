package com.polstat.pembelajaran_mandiri_ppk.mapper;

import com.polstat.pembelajaran_mandiri_ppk.dto.UserDTO;
import com.polstat.pembelajaran_mandiri_ppk.entity.User;

public class UserMapper {
    public static UserDTO toDTO(User user) {
        return UserDTO.builder()
                .id(user.getId())
                .email(user.getEmail())
                .role(user.getRole())
                .build();
    }

    public static User toEntity(UserDTO userDTO) {
        return User.builder()
                .id(userDTO.getId())
                .email(userDTO.getEmail())
                .role(userDTO.getRole())
                .build();
    }
}
