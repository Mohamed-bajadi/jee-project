package org.example.ir.ws.converter;

import org.example.ir.bean.Locale;
import org.example.ir.ws.dto.LocaleDto;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;


@Component
public class LocaleConverter {
    public Locale toBean(LocaleDto dto){
        Locale bean = new Locale();
        bean.setId(dto.getId());
        bean.setRef(dto.getRef());
        bean.setAddresse(dto.getAddresse());
        bean.setLibelle(dto.getLibelle());
        return bean;
    }
    public LocaleDto toDto(Locale bean){
        LocaleDto dto = new LocaleDto();
        dto.setId(bean.getId());
        dto.setRef(bean.getRef());
        dto.setAddresse(bean.getAddresse());
        dto.setLibelle(bean.getLibelle());
        return dto;
    }

    public List<Locale> toBean(List<LocaleDto> dtos ){
        return dtos.stream().map(this::toBean).collect(Collectors.toList());
    }

    public List<LocaleDto> toDto(List<Locale> beans) {
        return beans.stream().map(this::toDto).collect(Collectors.toList());
    }

}
