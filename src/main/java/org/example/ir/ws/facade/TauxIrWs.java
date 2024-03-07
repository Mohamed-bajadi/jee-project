package org.example.ir.ws.facade;


import org.example.ir.bean.TauxIr;
import org.example.ir.service.facade.TauxIrService;
import org.example.ir.ws.converter.TauxIrConverter;
import org.example.ir.ws.dto.TauxIrDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/taux-ir")
public class TauxIrWs {
    @Autowired
    private TauxIrService service;
    @Autowired
    private TauxIrConverter converter;

    @GetMapping("/id/{id}")
    public TauxIrDto findById(@PathVariable long id) {
        TauxIr tauxIr = service.findById(id);
        return converter.toDto(tauxIr);
    }

    @DeleteMapping("/id/{id}")
    public int deleteById(@PathVariable int id) {

        return service.deleteById(id);
    }

    @PostMapping
    public int save(@RequestBody TauxIrDto tauxIrDto) {
        return service.save(converter.toBean(tauxIrDto));
    }



}
