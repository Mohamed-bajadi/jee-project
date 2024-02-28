package org.example.ir.ws.converter;

import org.example.ir.bean.Societe;
import org.example.ir.ws.dto.SocieteDto;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class SocieteConverter {

    public Societe toBean(SocieteDto dto){
        Societe bean = new Societe();
        bean.setId(dto.getId());
        bean.setIce(dto.getIce());
        bean.setAdresse(dto.getAdresse());
        return bean;
    }

    public SocieteDto toDto(Societe bean){
        SocieteDto dto = new SocieteDto();
        dto.setId(bean.getId());
        dto.setIce(bean.getIce());
        dto.setAdresse(bean.getAdresse());
        return dto;
    }

    public List<Societe> toBean(List<SocieteDto> dtos){
       return dtos.stream().map(this::toBean).collect(Collectors.toList());
    }

    public List<SocieteDto> toDto(List<Societe> beans){
        return beans.stream().map(this::toDto).collect(Collectors.toList());
    }


}
