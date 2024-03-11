package org.example.ir.ws.facade;

import org.example.ir.bean.Locale;
import org.example.ir.service.impl.LocaleServiceImpl;
import org.example.ir.ws.converter.LocaleConverter;

import org.example.ir.ws.dto.LocaleDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/locale")
public class LocaleWs {
    @Autowired
    private LocaleConverter converter;
    @Autowired
    private LocaleServiceImpl service;

    @GetMapping("/id/{id}")
    public LocaleDto findById(@PathVariable long id) {
        Locale locale = service.findById(id) ;
        return converter.toDto(locale);
    }
    @DeleteMapping("/id/{id}")
    @Transactional
    public int deleteById(@PathVariable long id) {
        return service.deleteById(id);
    }
    @GetMapping("/ref/{ref}")
    public List<LocaleDto> findByRef(@PathVariable String ref) {
        List<Locale> locales = service.findByRef(ref) ;
        return converter.toDto(locales) ;
    }

    @PostMapping("")
    public int save(@RequestBody LocaleDto localeDto) {
        Locale locale = converter.toBean(localeDto);
        return service.save(locale);
    }
}
