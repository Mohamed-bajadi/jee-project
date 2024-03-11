package org.example.ir.ws.converter;
import org.example.ir.bean.GradeEmploye;
import org.example.ir.ws.dto.GradeEmployeDto;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.stream.Collectors;
@Component
public class GradeEmployeConverter {
    public GradeEmploye toBean(GradeEmployeDto dto){
        GradeEmploye bean = new GradeEmploye();
        bean.setId(dto.getId());
        bean.setCode(dto.getCode());
        bean.setLibelle(dto.getLibelle());
        return bean;
    }

    public GradeEmployeDto toDto(GradeEmploye bean){
        GradeEmployeDto dto = new GradeEmployeDto();
        dto.setId( bean.getId());
        dto.setCode( bean.getCode());
        dto.setLibelle( bean.getLibelle());
        return dto ;
    }

    public List<GradeEmploye> toBean(List<GradeEmployeDto> dtos ){
        return dtos.stream().map(this::toBean).collect(Collectors.toList());
    }

    public List<GradeEmployeDto> toDto(List<GradeEmploye> beans) {
        return beans.stream().map(this::toDto).collect(Collectors.toList());
    }

}
