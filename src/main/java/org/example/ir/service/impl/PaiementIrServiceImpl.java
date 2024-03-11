
package org.example.ir.service.impl;
import org.example.ir.bean.PaiementIr;
import org.example.ir.dao.PaiementIrDao;
import org.example.ir.service.facade.PaiementIrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaiementIrServiceImpl implements PaiementIrService {

    @Autowired
    private PaiementIrDao dao;
    @Override
    public PaiementIr findById(Long id){return dao.findPaiementIrById(id);}
    @Override
    public int deleteById(Long id){return dao.deletePaiementIrById(id);}


    @Override
    public int save(PaiementIr p) {
        if (findById(p.getId()) != null) {
            return -1;
        }else {
            dao.save(p);
            return 1;
        }
    }
}
