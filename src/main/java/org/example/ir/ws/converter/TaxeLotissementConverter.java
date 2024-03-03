package org.example.ir.ws.converter;

import org.example.ir.bean.TaxeLotiessment;
import org.example.ir.ws.dto.TaxeLotissementDto;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class TaxeLotissementConverter {
   public TaxeLotiessment toBean(TaxeLotissementDto dto){
       TaxeLotiessment bean = new TaxeLotiessment();
       bean.setId(dto.getId());
       bean.setDateDePresentation(dto.getDateDePresentation());
       bean.setRef(dto.getRef());
       bean.setSurface(dto.getSurface());
       bean.setRenovable(dto.getRenovable());
       bean.setMontantDeBase(dto.getMontantDeBase());
       return bean;
   }
   public TaxeLotissementDto toDto(TaxeLotiessment bean){
       TaxeLotissementDto dto = new TaxeLotissementDto();
       dto.setId(bean.getId());
       dto.setDateDePresentation(bean.getDateDePresentation());
       dto.setRef(bean.getRef());
       dto.setSurface(bean.getSurface());
       dto.setRenovable(bean.getRenovable());
       dto.setMontantDeBase(bean.getMontantDeBase());
       return dto;
   }
   public List<TaxeLotiessment> toBean(List<TaxeLotissementDto> dtos){
       return dtos.stream().map(this::toBean).collect(Collectors.toList());
   }
   public List<TaxeLotissementDto> toDto(List<TaxeLotiessment> beans){
       return beans.stream().map(this::toDto).collect(Collectors.toList());
   }
}
