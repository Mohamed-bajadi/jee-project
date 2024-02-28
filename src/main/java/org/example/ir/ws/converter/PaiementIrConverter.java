package org.example.ir.ws.converter;

import org.example.ir.bean.PaiementIr;
import org.example.ir.ws.dto.PaiementIrDto;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class PaiementIrConverter {
    public PaiementIr toBean(PaiementIrDto dto) {
        PaiementIr bean = new PaiementIr();
        bean.setId(dto.getId());
        bean.setDatePaiementIr(dto.getDatePaiementIr());
        bean.setMonth(dto.getMonth());
        bean.setYear(dto.getYear());
        bean.setTotalCotisationSalarial(dto.getTotalCotisationSalarial());
        bean.setTotalCotisationPatronal(dto.getTotalCotisationPatronal());
        bean.setTotalSalaireBrut(dto.getTotalSalaireBrut());
        bean.setTotalSalaireNet(dto.getTotalSalaireNet());
        return bean;
    }
    public PaiementIrDto toDto(PaiementIr bean) {
        PaiementIrDto dto = new PaiementIrDto();
        dto.setId(bean.getId());
        dto.setDatePaiementIr(bean.getDatePaiementIr());
        dto.setMonth(bean.getMonth());
        dto.setYear(bean.getYear());
        dto.setTotalCotisationSalarial(bean.getTotalCotisationSalarial());
        dto.setTotalCotisationPatronal(bean.getTotalCotisationPatronal());
        dto.setTotalSalaireBrut(bean.getTotalSalaireBrut());
        dto.setTotalSalaireNet(bean.getTotalSalaireNet());
        return dto;
    }
    public List<PaiementIr> toBean(List<PaiementIrDto> dtos){
        return dtos.stream().map(this::toBean).collect(Collectors.toList());
    }
    public List<PaiementIrDto> toDto(List<PaiementIr> beans){
        return beans.stream().map(this::toDto).collect(Collectors.toList());
    }
}
