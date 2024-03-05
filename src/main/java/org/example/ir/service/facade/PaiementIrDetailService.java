package org.example.ir.service.facade;

import jakarta.transaction.Transactional;
import org.example.ir.bean.PaiementIrDetail;

import java.util.List;

public interface PaiementIrDetailService {

 int  save(PaiementIrDetail paiementIrDetail);


    PaiementIrDetail findById(long id);


    List<PaiementIrDetail> findAll();

   void update(PaiementIrDetail paiementIrDetail);
    @Transactional
    int deleteById(long id);
}
