package org.example.ir.service.facade;

import org.example.ir.bean.TauxIr;


public interface TauxIrService {

    TauxIr findById(long id);

    int deleteById(int id );

    int save(TauxIr tauxIr);
}
