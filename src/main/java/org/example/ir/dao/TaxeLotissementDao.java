package org.example.ir.dao;

import org.example.ir.bean.TaxeLotissement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;

@Repository
public interface TaxeLotissementDao extends JpaRepository<TaxeLotissement, Long> {
    TaxeLotissement findByRef(String ref);

    int deleteByRef(String ref);

    TaxeLotissement findByDateDePresentationAfter(LocalDate date);
}
