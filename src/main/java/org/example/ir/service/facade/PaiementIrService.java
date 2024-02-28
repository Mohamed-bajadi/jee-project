package org.example.ir.service.facade;

import org.example.ir.bean.PaiementIr;

public interface PaiementIrService {
    PaiementIr findById(Long id);
    int deleteById(Long id);

    int save(PaiementIr p);
}