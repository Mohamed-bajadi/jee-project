package org.example.ir.ws.facade;

import org.example.ir.bean.Societe;

import org.example.ir.service.facade.SocieteService;



import org.example.ir.ws.converter.SocieteConverter;
import org.example.ir.ws.dto.SocieteDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/societe/")
public class SocieteWs {
    @Autowired
    private SocieteService service;
    @Autowired
    private SocieteConverter converter;

    @GetMapping("ice/{ice}")
    public SocieteDto findByIce(@PathVariable String ice) {
        Societe societe = service.findByIce(ice);
        return converter.toDto(societe);
    }

    @DeleteMapping("ice/{ice}")
    public int deleteByIce(@PathVariable String ice) {
        return service.deleteByIce(ice);
    }


    @PostMapping()
    public int save(@RequestBody SocieteDto dto) {
        Societe societe = converter.toBean(dto);
        return service.save(societe);
    }
}