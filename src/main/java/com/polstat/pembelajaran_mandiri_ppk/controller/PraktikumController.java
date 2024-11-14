package com.polstat.pembelajaran_mandiri_ppk.controller;

import com.polstat.pembelajaran_mandiri_ppk.dto.PraktikumDTO;
import com.polstat.pembelajaran_mandiri_ppk.service.PraktikumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/praktikum")
public class PraktikumController {

    @Autowired
    private PraktikumService praktikumService;

    @PostMapping("/submit/{mahasiswaId}")
    public ResponseEntity<PraktikumDTO> submitPraktikum(@PathVariable Long mahasiswaId, @RequestBody PraktikumDTO praktikumDTO) {
        PraktikumDTO submittedPraktikum = praktikumService.submitPraktikum(mahasiswaId, praktikumDTO);
        return ResponseEntity.ok(submittedPraktikum);
    }

    @PutMapping("/evaluate/{praktikumId}")
    public ResponseEntity<PraktikumDTO> evaluatePraktikum(@PathVariable Long praktikumId, @RequestParam Integer skor) {
        PraktikumDTO evaluatedPraktikum = praktikumService.evaluatePraktikum(praktikumId, skor);
        return ResponseEntity.ok(evaluatedPraktikum);
    }

    @GetMapping("/mahasiswa/{mahasiswaId}")
    public ResponseEntity<List<PraktikumDTO>> getPraktikumByMahasiswa(@PathVariable Long mahasiswaId) {
        List<PraktikumDTO> praktikumList = praktikumService.getPraktikumByMahasiswa(mahasiswaId);
        return ResponseEntity.ok(praktikumList);
    }
}
