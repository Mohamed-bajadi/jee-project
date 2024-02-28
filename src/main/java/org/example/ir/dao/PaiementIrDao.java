package org.example.ir.dao;

import org.example.ir.bean.PaiementIr;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PaiementIrDao extends JpaRepository<PaiementIr,Long> {

    PaiementIr findPaiementIrById(Long id);
    int deletePaiementIrById(Long id);


}
