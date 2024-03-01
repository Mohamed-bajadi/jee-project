package org.example.ir.ws.facade;

import jakarta.transaction.Transactional;
import org.example.ir.bean.PaiementIrDetail;
import org.example.ir.service.Impl.PaiementIrDetailServiceImpl;
import org.example.ir.ws.converter.PaiementIrDetailConverter;
import org.example.ir.ws.dto.PaiementIrDetailDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/paiemnetdetail/")
public class PaiementIrDetailWs {
    @Autowired
    PaiementIrDetailServiceImpl service;
    @Autowired
    PaiementIrDetailConverter converter;
    @PostMapping("")
    public int save(@RequestBody PaiementIrDetailDto dto) {
        PaiementIrDetail paiementIrDetail=converter.toBean(dto);
        return service.save(paiementIrDetail);
    }

    @GetMapping("id/{id}")
    public PaiementIrDetailDto findById(@PathVariable long id) {
        PaiementIrDetail paiementIrDetail= service.findById(id);
        return converter.toDto(paiementIrDetail);
    }
    @GetMapping("month/{month}/year/{year}")
    public List<PaiementIrDetailDto> findByMonthAndYear(@PathVariable int month,@PathVariable int year) {
        List<PaiementIrDetail> list =service.findByMonthAndYear(month, year);
        return converter.toDto(list);
    }
    @GetMapping("")
    public List<PaiementIrDetailDto> findAll() {
        List<PaiementIrDetail> all = service.findAll();
        return converter.toDto(all);
    }
    @PutMapping("update/")
    public void update(@RequestBody PaiementIrDetailDto dtos) {
        PaiementIrDetail paiementIrDetail=converter.toBean(dtos);
        service.update(paiementIrDetail);
    }
    @DeleteMapping("id/{id}")
    @Transactional
    public int deleteById(@PathVariable long id) {
        return service.deleteById(id);
    }
}
