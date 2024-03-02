package org.example.ir.dao;

import org.example.ir.bean.TaxeLotiessment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;

@Repository
public interface TaxeLotissementDao extends JpaRepository<TaxeLotiessment,Long> {
    TaxeLotiessment findByRef(String ref);
    int deleteByRef(String ref);

    TaxeLotiessment findByDateDePresentationAfter(LocalDate date);
}
