package org.example.ir.service.Impl;

import org.example.ir.bean.TaxeLotiessment;
import org.example.ir.dao.TaxeLotissementDao;

import org.example.ir.service.facade.TaxeLotissementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class TaxeLotissementServiceImpl implements TaxeLotissementService {
    @Autowired
    private TaxeLotissementDao taxeLotissmentDao;
    @Override
    public TaxeLotiessment findByRef(String ref) {
        return taxeLotissmentDao.findByRef(ref);
    }
@Override
    public int deleteByRef(String ref) {
        return taxeLotissmentDao.deleteByRef(ref);
    }
@Override
    public TaxeLotiessment findByDateDePresentationAfter(LocalDate date) {
        return taxeLotissmentDao.findByDateDePresentationAfter(date);
    }
@Override
    public List<TaxeLotiessment> findAll() {
        return taxeLotissmentDao.findAll();
    }



}
