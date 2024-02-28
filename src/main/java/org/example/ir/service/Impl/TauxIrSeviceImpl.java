package org.example.ir.service.Impl;

import org.example.ir.bean.TauxIr;
import org.example.ir.dao.TauxIrDao;
import org.example.ir.service.facade.TauxIrService;
import org.springframework.beans.factory.annotation.Autowired;

public class TauxIrSeviceImpl implements TauxIrService {

    @Override
    public TauxIr findById(long id) {
        return doa.findById(id);
    }

    @Override
    public int deleteById(int id) {
        return 0;
    }

    @Override
    public TauxIr findById(Long id) {
        return null;
    }

    public int deleteById(long id) {
        return doa.deleteById(id);
    }
@Autowired
    private TauxIrDao doa;
}
