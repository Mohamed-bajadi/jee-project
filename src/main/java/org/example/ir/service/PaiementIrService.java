package org.example.ir.service;

import org.example.ir.bean.PaiementIr;
import org.example.ir.dao.PaiementIrDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PaiementIrService {
    @Autowired
    private PaiementIrDao dao;
    public PaiementIr findById(Long id){return dao.findPaiementIrById(id);}
    public int deleteById(Long id){return dao.deletePaiementIrById(id);}

    public int save(PaiementIr p) {
        if (findById(p.getId()) != null) {
            return -1;
        }else {
            dao.save(p);
            return 1;
        }
    }


}
