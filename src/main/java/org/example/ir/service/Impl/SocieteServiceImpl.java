package org.example.ir.service.impl;

import org.example.ir.bean.Societe;
import org.example.ir.dao.SocieteDao;
import org.example.ir.service.facade.SocieteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class SocieteServiceImpl implements SocieteService {
    private @Autowired SocieteDao dao;
    @Override
    public Societe findById(long id) {
        return dao.findById(id);
    }



    @Override
    public Societe findByIce(String ice) {
        return dao.findByIce(ice);
    }

    @Transactional
    @Override
    public int deleteByIce(String ice) {
        return dao.deleteByIce(ice);
    }

    @Override
    public int save(Societe s) {
        if (findByIce(s.getIce()) != null) {
            return -1;
        } else {
            dao.save(s);
            return 1;
        }
    }



}
