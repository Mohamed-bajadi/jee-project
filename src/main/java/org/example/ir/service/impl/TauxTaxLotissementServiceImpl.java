package org.example.ir.service.impl;

import org.example.ir.bean.TauxTaxLotissement;
import org.example.ir.dao.TauxTaxLotissementDao;
import org.example.ir.service.facade.TauxTaxLotissementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class TauxTaxLotissementServiceImpl implements TauxTaxLotissementService {

    private @Autowired TauxTaxLotissementDao dao;

    @Override
    public List<TauxTaxLotissement> findByDateAppMaxBetween(LocalDateTime date1, LocalDateTime date2) {
        return dao.findByDateAppMaxBetween(date1, date2);
    }

    @Override
    @Transactional
    public void deleteById(Long id) {
        dao.deleteById(id);
    }

    @Override
    public TauxTaxLotissement findByCode(String code) {
        return dao.findByCode(code);
    }

    @Override
    public int save(TauxTaxLotissement tauxTaxLotissement) {
        if (findByCode(tauxTaxLotissement.getCode()) != null) {
            return -1;
        } else {
            dao.save(tauxTaxLotissement);
            return 1;
        }
    }
}
