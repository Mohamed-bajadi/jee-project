package org.example.ir.ws.converter;



import org.example.ir.bean.Employe;
import org.example.ir.ws.dto.EmployeDto;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class EmployeConverter{
    public Employe toBean(EmployeDto dto){
        Employe bean = new Employe();
        bean.setId(dto.getId());
        bean.setFirstname(dto.getFirstname());
        bean.setLastname(dto.getLastname());
        return bean;
    }
    public EmployeDto toDto(Employe bean){
        EmployeDto dto = new EmployeDto();
        dto.setId(bean.getId());
        dto.setFirstname(bean.getFirstname());
        dto.setLastname(bean.getLastname());
        return dto;
    }

    public List<Employe> toBean(List<EmployeDto> dtos ){
        return dtos.stream().map(this::toBean).collect(Collectors.toList());
    }

    public List<EmployeDto> toDto(List<Employe> beans) {
        return beans.stream().map(this::toDto).collect(Collectors.toList());
    }


}

