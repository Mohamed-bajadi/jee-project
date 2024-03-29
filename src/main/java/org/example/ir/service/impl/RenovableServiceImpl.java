package org.example.ir.service.impl;

import org.example.ir.bean.Renovable;
import org.example.ir.dao.RenovableDao;
import org.example.ir.service.facade.RenovableService;
import org.springframework.stereotype.Service;

@Service
public class RenovableServiceImpl implements RenovableService {
    private final RenovableDao dao;
    public RenovableServiceImpl(RenovableDao dao) {
        this.dao = dao;
    }
    @Override
    public Renovable findById(Long id) {
        return dao.findRenovableById(id);
    }

    @Override
    public int deleteById(Long id) {
        return dao.deleteRenovableById(id);
    }

    @Override
    public int save(Renovable renovable) {
        if (findById(renovable.getId()) != null) {
            return -1;
        }else {
            dao.save(renovable);
            return 1;
        }
    }
}
