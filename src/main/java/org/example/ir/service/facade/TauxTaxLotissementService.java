package org.example.ir.service.facade;

import org.example.ir.bean.TauxTaxLotissement;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;

public interface TauxTaxLotissementService {

    List<TauxTaxLotissement> findByDateAppMaxBetween(LocalDateTime date1, LocalDateTime date2);

    @Transactional
    void deleteById(Long id);

    TauxTaxLotissement findByCode(String code);

    int save(TauxTaxLotissement tauxTaxLotissement);
}
