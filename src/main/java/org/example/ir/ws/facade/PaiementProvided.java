package org.example.ir.ws.facade;

import org.example.ir.bean.PaiementIr;
import org.example.ir.service.facade.PaiementIrService;
import org.example.ir.ws.converter.PaiementIrConverter;
import org.example.ir.ws.dto.PaiementIrDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/paiementIr/")
public class PaiementProvided {
    @Autowired
    private PaiementIrService service;
    @Autowired
    private PaiementIrConverter converter;
    @GetMapping("id/{id}")
    public PaiementIrDto findById(@PathVariable Long id){
        PaiementIr bean = service.findById(id);
        return converter.toDto(bean);
    }
    @DeleteMapping("id/{id}")
    public int deleteById(@PathVariable Long id){return service.deleteById(id);}

    @PostMapping()
    public int save(@RequestBody PaiementIrDto dto) {
        PaiementIr bean = converter.toBean(dto);
        return service.save(bean);
    }
}
