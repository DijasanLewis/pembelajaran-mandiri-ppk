package com.polstat.pembelajaran_mandiri_ppk.service;

import com.polstat.pembelajaran_mandiri_ppk.dto.UserDTO;
import com.polstat.pembelajaran_mandiri_ppk.dto.UserRegisterDTO;
import com.polstat.pembelajaran_mandiri_ppk.dto.UserLoginDTO;

public interface UserService {
    UserDTO register(UserRegisterDTO userRegisterDTO);  // Untuk registrasi pengguna baru
    UserDTO login(UserLoginDTO userLoginDTO);  // Untuk login
    UserDTO getProfile(Long userId);  // Mengambil profil pengguna
    UserDTO updateProfile(Long userId, UserDTO userDTO);  // Mengupdate profil pengguna
    void changePassword(Long userId, String newPassword);  // Mengubah password
    void deleteAccount(Long userId);  // Menghapus akun pengguna
}
