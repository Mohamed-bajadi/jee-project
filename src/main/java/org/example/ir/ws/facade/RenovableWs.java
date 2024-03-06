package org.example.ir.ws.facade;

import org.example.ir.bean.Renovable;
import org.example.ir.service.facade.RenovableService;
import org.example.ir.ws.converter.RenovableConverter;
import org.example.ir.ws.dto.RenovableDto;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/renovable")
public class RenovableWs {
    @Autowired
    private  RenovableService service;
    @Autowired
    private  RenovableConverter converter;


    @GetMapping("id/{id}")
    public RenovableDto findById(@PathVariable Long id){
        Renovable bean = service.findById(id);
        return converter.toDto(bean);
    }
    @DeleteMapping("id/{id}")
    public int deleteById(@PathVariable Long id){return service.deleteById(id);}

    @PostMapping("/")
    public int save(@RequestBody RenovableDto dto) {
        Renovable bean = converter.toBean(dto);
        return service.save(bean);


    }
}
