package org.example.ir.ws.converter;

import org.example.ir.bean.TauxIr;
import org.example.ir.ws.dto.TauxIrDto;
import org.springframework.stereotype.Component;

@Component
public class TauxIrConverter {

    public TauxIr toBean(TauxIrDto dto){
        TauxIr bean = new TauxIr();
        bean.setId(dto.getId());
        bean.setSalaireMax(dto.getSalaireMax());
        bean.setSalaireMin(dto.getSalaireMin());
        bean.setPourcentage(dto.getPourcentage());
        bean.setDateMin(dto.getDateMin());
        bean.setDateMax(dto.getDateMax());
        bean.setCotisationPatronal(dto.getCotisationPatronal());
        bean.setCotisationSalarial(dto.getCotisationSalarial());
        return bean;
    }
    public TauxIrDto toDto(TauxIr bean){
        TauxIrDto dto = new TauxIrDto();
        dto.setId(bean.getId());
        dto.setSalaireMax(bean.getSalaireMax());
        dto.setSalaireMin(bean.getSalaireMin());
        dto.setPourcentage(bean.getPourcentage());
        dto.setDateMin(bean.getDateMin());
        dto.setDateMax(bean.getDateMax());
        dto.setCotisationPatronal(bean.getCotisationPatronal());
        dto.setCotisationSalarial(bean.getCotisationSalarial());
        return dto;
    }
}