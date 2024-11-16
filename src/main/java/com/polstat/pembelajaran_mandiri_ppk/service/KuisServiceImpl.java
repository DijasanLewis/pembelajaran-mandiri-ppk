package com.polstat.pembelajaran_mandiri_ppk.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.polstat.pembelajaran_mandiri_ppk.dto.KuisDTO;
import com.polstat.pembelajaran_mandiri_ppk.entity.Kuis;
import com.polstat.pembelajaran_mandiri_ppk.entity.Mahasiswa;
import com.polstat.pembelajaran_mandiri_ppk.entity.StatusKuis;
import com.polstat.pembelajaran_mandiri_ppk.mapper.KuisMapper;
import com.polstat.pembelajaran_mandiri_ppk.repository.KuisRepository;
import com.polstat.pembelajaran_mandiri_ppk.repository.MahasiswaRepository;
import com.polstat.pembelajaran_mandiri_ppk.repository.StatusKuisRepository;

@Service
public class KuisServiceImpl implements KuisService {

    @Autowired
    private KuisRepository kuisRepository;

    @Autowired
    private MahasiswaRepository mahasiswaRepository;

    @Autowired
    private StatusKuisRepository statusKuisRepository;

    @Override
    public KuisDTO addKuis(KuisDTO kuisDTO) {
        Kuis kuis = KuisMapper.toEntity(kuisDTO);
        Kuis savedKuis = kuisRepository.save(kuis);
        return KuisMapper.toDTO(savedKuis);
    }

    @Override
    public List<KuisDTO> getAllKuis() {
        return kuisRepository.findAll().stream()
                .map(KuisMapper::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public KuisDTO getKuisById(Long id) {
        Kuis kuis = kuisRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Kuis tidak ditemukan"));
        return KuisMapper.toDTO(kuis);
    }

    @Override
    public void updateKuisStatus(Long mahasiswaUserId, Long kuisId, String status) {
        // Cari Mahasiswa berdasarkan userId
        Mahasiswa mahasiswa = mahasiswaRepository.findById(mahasiswaUserId)
                .orElseThrow(() -> new RuntimeException("Mahasiswa tidak ditemukan"));

        // Cari Kuis berdasarkan kuisId
        Kuis kuis = kuisRepository.findById(kuisId)
                .orElseThrow(() -> new RuntimeException("Kuis tidak ditemukan"));

        // Cari atau buat entri StatusKuis baru
        StatusKuis statusKuis = statusKuisRepository.findByMahasiswaUserIdAndKuisId(mahasiswaUserId, kuisId)
                .orElse(new StatusKuis());
        statusKuis.setMahasiswa(mahasiswa);
        statusKuis.setKuis(kuis);
        statusKuis.setStatus(status);

        // Simpan entri StatusKuis
        statusKuisRepository.save(statusKuis);
    }
}
