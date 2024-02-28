package org.example.ir.dao;

import org.example.ir.bean.PaiementIrDetail;
import org.example.ir.bean.TauxIr;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TauxIrDao extends JpaRepository<TauxIr,Long> {
    TauxIr findById(long id);
    int deleteById(long id );
}
