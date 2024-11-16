package com.polstat.pembelajaran_mandiri_ppk.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.polstat.pembelajaran_mandiri_ppk.dto.PertemuanDTO;
import com.polstat.pembelajaran_mandiri_ppk.entity.Pertemuan;
import com.polstat.pembelajaran_mandiri_ppk.mapper.PertemuanMapper;
import com.polstat.pembelajaran_mandiri_ppk.repository.PertemuanRepository;

@Service
public class MateriServiceImpl implements MateriService {

    @Autowired
    private PertemuanRepository pertemuanRepository;

    @Override
    public PertemuanDTO addPertemuan(PertemuanDTO pertemuanDTO) {
        Pertemuan pertemuan = PertemuanMapper.toEntity(pertemuanDTO);
        Pertemuan savedPertemuan = pertemuanRepository.save(pertemuan);
        return PertemuanMapper.toDTO(savedPertemuan);
    }

    @Override
    public List<PertemuanDTO> getAllPertemuan() {
        return pertemuanRepository.findAll().stream()
                .map(PertemuanMapper::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public PertemuanDTO getPertemuanById(Long id) {
        Pertemuan pertemuan = pertemuanRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Pertemuan tidak ditemukan"));
        return PertemuanMapper.toDTO(pertemuan);
    }

    @Override
    public PertemuanDTO updatePertemuan(Long id, PertemuanDTO pertemuanDTO) {
        Pertemuan pertemuan = pertemuanRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Pertemuan tidak ditemukan"));
        pertemuan.setJudul(pertemuanDTO.getJudul());
        pertemuan.setLinkMateri(pertemuanDTO.getLinkMateri());
        pertemuan.setLinkModulPraktikum(pertemuanDTO.getLinkModulPraktikum());
        Pertemuan updatedPertemuan = pertemuanRepository.save(pertemuan);
        return PertemuanMapper.toDTO(updatedPertemuan);
    }

    @Override
    public void deletePertemuan(Long id) {
        pertemuanRepository.deleteById(id);
    }
}