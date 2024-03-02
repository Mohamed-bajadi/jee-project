package org.example.ir.service.facade;

import org.example.ir.bean.TaxeLotiessment;

import java.time.LocalDate;
import java.util.List;

public interface TaxeLotissementService {
    TaxeLotiessment findByRef(String ref);

    int deleteByRef(String ref);

    TaxeLotiessment findByDateDePresentationAfter(LocalDate date);

    List<TaxeLotiessment> findAll();
}
