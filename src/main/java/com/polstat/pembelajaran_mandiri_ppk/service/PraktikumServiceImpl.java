package com.polstat.pembelajaran_mandiri_ppk.service;

import com.polstat.pembelajaran_mandiri_ppk.dto.PraktikumDTO;
import com.polstat.pembelajaran_mandiri_ppk.entity.Mahasiswa;
import com.polstat.pembelajaran_mandiri_ppk.entity.Pertemuan;
import com.polstat.pembelajaran_mandiri_ppk.entity.Praktikum;
import com.polstat.pembelajaran_mandiri_ppk.mapper.PraktikumMapper;
import com.polstat.pembelajaran_mandiri_ppk.repository.MahasiswaRepository;
import com.polstat.pembelajaran_mandiri_ppk.repository.PertemuanRepository;
import com.polstat.pembelajaran_mandiri_ppk.repository.PraktikumRepository;
import com.polstat.pembelajaran_mandiri_ppk.service.PraktikumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PraktikumServiceImpl implements PraktikumService {

    @Autowired
    private PraktikumRepository praktikumRepository;

    @Autowired
    private MahasiswaRepository mahasiswaRepository;

    @Autowired
    private PertemuanRepository pertemuanRepository;

    @Override
    public PraktikumDTO submitPraktikum(Long mahasiswaId, PraktikumDTO praktikumDTO) {
        Mahasiswa mahasiswa = mahasiswaRepository.findById(mahasiswaId)
                .orElseThrow(() -> new RuntimeException("Mahasiswa tidak ditemukan"));
        Pertemuan pertemuan = pertemuanRepository.findById(praktikumDTO.getPertemuanId())
                .orElseThrow(() -> new RuntimeException("Pertemuan tidak ditemukan"));

        Praktikum praktikum = PraktikumMapper.toEntity(praktikumDTO);
        praktikum.setMahasiswa(mahasiswa);
        praktikum.setPertemuan(pertemuan);
        praktikum.setStatusPengumpulan("Sudah dikerjakan");

        Praktikum savedPraktikum = praktikumRepository.save(praktikum);
        return PraktikumMapper.toDTO(savedPraktikum);
    }

    @Override
    public PraktikumDTO evaluatePraktikum(Long praktikumId, Integer skor) {
        Praktikum praktikum = praktikumRepository.findById(praktikumId)
                .orElseThrow(() -> new RuntimeException("Praktikum tidak ditemukan"));

        praktikum.setStatusPenilaian("Sudah Dinilai");
        praktikum.setSkor(skor);

        Praktikum evaluatedPraktikum = praktikumRepository.save(praktikum);
        return PraktikumMapper.toDTO(evaluatedPraktikum);
    }

    @Override
    public List<PraktikumDTO> getPraktikumByMahasiswa(Long mahasiswaId) {
        return praktikumRepository.findByMahasiswa_UserId(mahasiswaId).stream()
                .map(PraktikumMapper::toDTO)
                .collect(Collectors.toList());
    }
}
