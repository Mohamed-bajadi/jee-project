package org.example.ir.ws.converter;

import org.example.ir.bean.EmployeSalaireHistory;
import org.example.ir.ws.dto.EmployeSalaireHistoryDto;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class EmployeSalaireHistoryConverter {

    public EmployeSalaireHistory toBean(EmployeSalaireHistoryDto dto) {
        EmployeSalaireHistory bean = new EmployeSalaireHistory();
        bean.setEmploye(dto.getEmploye());
        bean.setAnneeDepart(dto.getAnneeDepart());
        bean.setAnneeFin(dto.getAnneeFin());
        bean.setMoisDepart(dto.getMoisDepart());
        bean.setMoisFin(dto.getMoisFin());
        bean.setId(dto.getId());
        bean.setRef(dto.getRef());
        bean.setSalaireBrut(dto.getSalaireBrut());
        bean.setSociete(dto.getSociete());
        return bean;
    }
public EmployeSalaireHistoryDto toDto(EmployeSalaireHistory bean) {
        EmployeSalaireHistoryDto dto= new EmployeSalaireHistoryDto();
        dto.setEmploye(bean.getEmploye());
        dto.setAnneeDepart(bean.getAnneeDepart());
        dto.setAnneeFin(bean.getAnneeFin());
        dto.setMoisDepart(bean.getMoisDepart());
        dto.setMoisFin(bean.getMoisFin());
        dto.setId(bean.getId());
        dto.setRef(bean.getRef());
        dto.setSalaireBrut(bean.getSalaireBrut());
        dto.setSociete(bean.getSociete());
        return dto;
    }
    List<EmployeSalaireHistory> toBean(List<EmployeSalaireHistoryDto> dtos){
        return dtos.stream().map(this::toBean).collect(Collectors.toList());
    }
    public List<EmployeSalaireHistoryDto> toDto(List<EmployeSalaireHistory> beans){
        return beans.stream().map(this::toDto).collect(Collectors.toList());
    }
}
