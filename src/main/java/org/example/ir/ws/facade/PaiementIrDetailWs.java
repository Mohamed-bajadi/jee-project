package org.example.ir.ws.facade;

import jakarta.transaction.Transactional;
import org.example.ir.bean.PaiementIrDetail;
import org.example.ir.service.facade.PaiementIrDetailService;
import org.example.ir.ws.converter.PaiementIrDetailConverter;
import org.example.ir.ws.dto.PaiementIrDetailDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/paiemenetDetail/")
public class PaiementIrDetailWs {
    @Autowired
    private PaiementIrDetailService service;
    @Autowired
   private  PaiementIrDetailConverter converter;
    @PostMapping()
    public int save(@RequestBody PaiementIrDetailDto dto) {
        PaiementIrDetail paiementIrD=converter.toBean(dto);
        return service.save(paiementIrD);
    }

    @GetMapping("id/{id}")
    public PaiementIrDetailDto findById(@PathVariable long id) {
        PaiementIrDetail paiementIrDetail= service.findById(id);
        return converter.toDto(paiementIrDetail);
    }

    @GetMapping()
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
