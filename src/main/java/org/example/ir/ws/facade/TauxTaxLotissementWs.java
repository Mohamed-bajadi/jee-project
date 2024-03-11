package org.example.ir.ws.facade;

import org.example.ir.bean.TauxTaxLotissement;
import org.example.ir.service.impl.TauxTaxLotissementServiceImpl;
import org.example.ir.ws.converter.TauxTaxLotissementConverter;
import org.example.ir.ws.dto.TauxTaxLotissementDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("api/tauxTaxLotissement")
public class TauxTaxLotissementWs {

    private @Autowired TauxTaxLotissementServiceImpl service;
    private @Autowired TauxTaxLotissementConverter converter;


    @GetMapping("/code/{code}")
    public TauxTaxLotissementDto findByCode(@PathVariable String code) {
        TauxTaxLotissement tauxTaxLotissement = service.findByCode(code);
        return converter.toDto(tauxTaxLotissement);
    }

    @GetMapping("/date1/{date1}/date2/{date2}")
    public List<TauxTaxLotissementDto> findByDateAppMaxBetween(@PathVariable LocalDateTime date1, @PathVariable LocalDateTime date2) {
        List<TauxTaxLotissement> tauxTaxLotissements = service.findByDateAppMaxBetween(date1, date2);
        return converter.toDto(tauxTaxLotissements);
    }

    @DeleteMapping("/id/{id}")
    public void deleteById(Long id) {
        service.deleteById(id);
    }

    @PostMapping("/")
    public int save(TauxTaxLotissementDto tauxTaxLotissementDto) {
        TauxTaxLotissement tauxTaxLotissement = converter.toBean(tauxTaxLotissementDto);
        return service.save(tauxTaxLotissement);
    }
}
