package org.example.ir.dao;

import org.example.ir.bean.PaiementIrDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository


public interface PaiementIrDetailDao extends JpaRepository<PaiementIrDetail,Long> {
    int deleteById(long id);
    PaiementIrDetail findById(long id);


}
