package com.polstat.pembelajaran_mandiri_ppk.controller;

import com.polstat.pembelajaran_mandiri_ppk.dto.PertemuanDTO;
import com.polstat.pembelajaran_mandiri_ppk.service.MateriService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pertemuan")
public class MateriController {

    @Autowired
    private MateriService materiService;

    @PostMapping
    public ResponseEntity<PertemuanDTO> addPertemuan(@RequestBody PertemuanDTO pertemuanDTO) {
        PertemuanDTO savedPertemuan = materiService.addPertemuan(pertemuanDTO);
        return ResponseEntity.ok(savedPertemuan);
    }

    @GetMapping
    public ResponseEntity<List<PertemuanDTO>> getAllPertemuan() {
        List<PertemuanDTO> pertemuanList = materiService.getAllPertemuan();
        return ResponseEntity.ok(pertemuanList);
    }

    @GetMapping("/{id}")
    public ResponseEntity<PertemuanDTO> getPertemuanById(@PathVariable Long id) {
        PertemuanDTO pertemuan = materiService.getPertemuanById(id);
        return ResponseEntity.ok(pertemuan);
    }

    @PutMapping("/{id}")
    public ResponseEntity<PertemuanDTO> updatePertemuan(@PathVariable Long id, @RequestBody PertemuanDTO pertemuanDTO) {
        PertemuanDTO updatedPertemuan = materiService.updatePertemuan(id, pertemuanDTO);
        return ResponseEntity.ok(updatedPertemuan);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePertemuan(@PathVariable Long id) {
        materiService.deletePertemuan(id);
        return ResponseEntity.noContent().build();
    }
}
