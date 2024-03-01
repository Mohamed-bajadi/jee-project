package org.example.ir.ws.converter;

import org.example.ir.bean.Renovable;
import org.example.ir.ws.dto.RenovableDto;

import java.util.List;
import java.util.stream.Collectors;

public class RenovableConverter {

    public Renovable toBean(RenovableDto dto){
        Renovable bean = new Renovable();
        bean.setId(dto.getId());
        bean.setCim(dto.getCim());
        bean.setNom(dto.getNom());
        bean.setPrenom(dto.getPrenom());
        return bean;

    }
    public RenovableDto toDto(Renovable bean){
        RenovableDto dto = new RenovableDto();
        dto.setId(bean.getId());
        dto.setCim(bean.getCim());
        dto.setNom(bean.getNom());
        dto.setPrenom(bean.getPrenom());
        return dto;

    }
    public List<Renovable> toBean(List<RenovableDto> dtos){
        return dtos.stream().map(this::toBean).collect(Collectors.toList());
    }
    public List<RenovableDto> toDto(List<Renovable> beans){
        return beans.stream().map(this::toDto).collect(Collectors.toList());
    }
}
