package org.example.ir.ws.facade;

import org.example.ir.bean.TaxeLotiessment;
import org.example.ir.service.facade.TaxeLotissementService;
import org.example.ir.ws.converter.TaxeLotissementConverter;
import org.example.ir.ws.dto.TaxeLotissementDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/taxeLotissement")
public class TaxeLotissementWs {
    @Autowired
    private TaxeLotissementService service;
    @Autowired
    private TaxeLotissementConverter converter;
@GetMapping("/ref/{ref}")
    public TaxeLotissementDto findByRef(@PathVariable String ref) {
    TaxeLotiessment byRef = service.findByRef(ref);
    return converter.toDto(byRef);
    }
@DeleteMapping("/ref/{ref}")
    public int deleteByRef(@PathVariable String ref) {
        return service.deleteByRef(ref);
    }
@GetMapping("/date/{date}")
    public TaxeLotissementDto findByDateDePresentationAfter(@PathVariable LocalDate date) {
    TaxeLotiessment taxeLotiessment = service.findByDateDePresentationAfter(date);
    return converter.toDto(taxeLotiessment);
    }
@GetMapping("/")
    public List<TaxeLotissementDto> findAll() {
        List<TaxeLotiessment> all = service.findAll();
        return converter.toDto(all);
    }
}
