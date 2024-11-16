package com.polstat.pembelajaran_mandiri_ppk.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.polstat.pembelajaran_mandiri_ppk.dto.KuisDTO;
import com.polstat.pembelajaran_mandiri_ppk.service.KuisService;

@RestController
@RequestMapping("/api/kuis")
public class KuisController {

    @Autowired
    private KuisService kuisService;

    @PostMapping
    public ResponseEntity<KuisDTO> addKuis(@RequestBody KuisDTO kuisDTO) {
        KuisDTO savedKuis = kuisService.addKuis(kuisDTO);
        return ResponseEntity.ok(savedKuis);
    }

    @GetMapping
    public ResponseEntity<List<KuisDTO>> getAllKuis() {
        List<KuisDTO> kuisList = kuisService.getAllKuis();
        return ResponseEntity.ok(kuisList);
    }

    @GetMapping("/{id}")
    public ResponseEntity<KuisDTO> getKuisById(@PathVariable Long id) {
        KuisDTO kuis = kuisService.getKuisById(id);
        return ResponseEntity.ok(kuis);
    }

    @PutMapping("/{mahasiswaId}/{kuisId}/status")
    public ResponseEntity<Void> updateKuisStatus(@PathVariable Long mahasiswaId, @PathVariable Long kuisId, @RequestParam String status) {
        kuisService.updateKuisStatus(mahasiswaId, kuisId, status);
        return ResponseEntity.noContent().build();
    }
}
