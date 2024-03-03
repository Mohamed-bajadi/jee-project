package org.example.ir.ws.facade;

import org.example.ir.service.Impl.LocaleServiceImpl;
import org.example.ir.ws.converter.LocaleConverter;
import org.example.ir.ws.dto.EmployeDto;
import org.example.ir.ws.dto.LocaleDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Locale;

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
    public List<EmployeDto> findByRef(@PathVariable String ref) {
        List<Locale> locales = service.findByRef(ref) ;
        return converter.toDto(locales) ;
    }
    @GetMapping("")

    public List<LocaleDto> findAll() {
        List<Locale> all = service.findAll();
        return converter.toDto(all);
    }

    @PostMapping("")
    public int save(@RequestBody LocaleDto localeDto) {
        Locale locale = converter.toBean(localeDto);
        return service.save(locale);
    }


}
