package org.example.ir.ws.converter;

import org.example.ir.bean.PaiementIrDetail;
import org.example.ir.ws.dto.PaiementIrDetailDto;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class PaiementIrDetailConverter{
    public PaiementIrDetail toBean(PaiementIrDetailDto dto){
        PaiementIrDetail bean = new PaiementIrDetail();
        bean.setId(dto.getId());
        bean.setCotoisationSalarial(dto.getCotoisationsalarial());
        bean.setCotisationPatronal(dto.getCotisationpatronel());
        bean.setPaiementIr(dto.getPaiementIr());
        bean.setSalaireBrute(dto.getSalaireBrute());
        bean.setSalaireNet(dto.getSalaireNet());
        bean.setTauxIr(dto.getTauxIr());
        bean.setEmploye(dto.getEmploye());
        return bean;
    }
    public PaiementIrDetailDto toDto( PaiementIrDetail bean){
        PaiementIrDetailDto dto = new PaiementIrDetailDto();
        dto.setId(bean.getId());
        dto.setCotoisationsalarial(bean.getCotoisationSalarial());
        dto.setCotisationpatronel(bean.getCotisationPatronal());
        dto.setPaiementIr(bean.getPaiementIr());
        dto.setSalaireBrute(bean.getSalaireBrute());
        dto.setSalaireNet(bean.getSalaireNet());
        dto.setTauxIr(bean.getTauxIr());
        dto.setEmploye(bean.getEmploye());
        return dto;
    }

    public List<PaiementIrDetail> toBean(List<PaiementIrDetailDto> dtos ){
        return dtos.stream().map(this::toBean).collect(Collectors.toList());
    }

    public List<PaiementIrDetailDto> toDto(List<PaiementIrDetail> beans) {
        return beans.stream().map(this::toDto).collect(Collectors.toList());
    }



}
