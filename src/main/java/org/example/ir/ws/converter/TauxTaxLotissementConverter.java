package org.example.ir.ws.converter;

import org.example.ir.bean.TauxTaxLotissement;
import org.example.ir.ws.dto.TauxTaxLotissementDto;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class TauxTaxLotissementConverter {

    public TauxTaxLotissement toBean(TauxTaxLotissementDto dto) {
        TauxTaxLotissement tauxTaxLotissement = new TauxTaxLotissement();
        tauxTaxLotissement.setCode(dto.getCode());
        tauxTaxLotissement.setId(dto.getId());
        tauxTaxLotissement.setDateAppMax(dto.getDateAppMax());
        tauxTaxLotissement.setDateAppMin(dto.getDateAppMin());
        tauxTaxLotissement.setMontantParMetreCarre(dto.getMontantParMetreCarre());
        return tauxTaxLotissement;
    }

    public TauxTaxLotissementDto toDto(TauxTaxLotissement bean) {
        TauxTaxLotissementDto tauxTaxLotissementDto = new TauxTaxLotissementDto();
        tauxTaxLotissementDto.setCode(bean.getCode());
        tauxTaxLotissementDto.setId(bean.getId());
        tauxTaxLotissementDto.setDateAppMax(bean.getDateAppMax());
        tauxTaxLotissementDto.setDateAppMin(bean.getDateAppMin());
        tauxTaxLotissementDto.setMontantParMetreCarre(bean.getMontantParMetreCarre());
        return tauxTaxLotissementDto;
    }

    public List<TauxTaxLotissement> toBean(List<TauxTaxLotissementDto> dtos) {
        return dtos.stream().map(this::toBean).collect(Collectors.toList());
    }

    public List<TauxTaxLotissementDto> toDto(List<TauxTaxLotissement> beans) {
        return beans.stream().map(this::toDto).collect(Collectors.toList());
    }
}
