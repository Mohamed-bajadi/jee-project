package org.example.ir.service.Impl;

import org.example.ir.bean.TauxIr;
import org.example.ir.dao.TauxIrDao;
import org.example.ir.service.facade.TauxIrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TauxIrSeviceImpl implements TauxIrService {

    @Autowired
    private TauxIrDao tauxIrDao;
    @Override
    public TauxIr findById(long id) {
        return tauxIrDao.findById(id);
    }

    @Override
    public int deleteById(int id) {
        return tauxIrDao.deleteById(id);
    }

    @Override
    public int save(TauxIr tauxIr) {
        if (findById(tauxIr.getId()) != null) {
            return -1;
        } else {
            tauxIrDao.save(tauxIr);
            return 1;
        }
    }
}
