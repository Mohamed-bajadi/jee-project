package org.example.ir.service.Impl;

import org.example.ir.bean.Renovable;
import org.example.ir.dao.RenovableDao;
import org.example.ir.service.facade.RenovableService;

import org.springframework.stereotype.Service;

@Service

<<<<<<< HEAD

=======
>>>>>>> efdcd1be644e6e7787ea751540e66fb66edad8cb
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
