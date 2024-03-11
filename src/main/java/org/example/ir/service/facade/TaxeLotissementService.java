package org.example.ir.service.facade;

import org.example.ir.bean.TaxeLotissement;

import java.time.LocalDate;
import java.util.List;

public interface TaxeLotissementService {
    TaxeLotissement findByRef(String ref);

    int deleteByRef(String ref);

    TaxeLotissement findByDateDePresentationAfter(LocalDate date);

    List<TaxeLotissement> findAll();
}
