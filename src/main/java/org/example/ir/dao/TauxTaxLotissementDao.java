package org.example.ir.dao;

import org.example.ir.bean.TauxTaxLotissement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface TauxTaxLotissementDao extends JpaRepository<TauxTaxLotissement,Long> {
    List<TauxTaxLotissement> findByDateAppMaxBetween(LocalDateTime date1, LocalDateTime date2);

    @Transactional
    void deleteById(Long id) ;

    TauxTaxLotissement findByCode(String code);

}
