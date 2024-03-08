package org.example.ir.service.Impl;

import jakarta.transaction.Transactional;
import org.example.ir.bean.Employe;
import org.example.ir.bean.PaiementIrDetail;
import org.example.ir.bean.TauxIr;
import org.example.ir.dao.PaiementIrDetailDao;
import org.example.ir.service.facade.EmployeService;
import org.example.ir.service.facade.PaiementIrDetailService;
import org.example.ir.service.facade.TauxIrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaiementIrDetailServiceImpl implements PaiementIrDetailService {

    @Autowired
    private PaiementIrDetailDao paiementIrDetailDao;
    @Autowired
    private EmployeService employeService;
    @Autowired
    private TauxIrService tauxIrService;

    @Override
    public int save(PaiementIrDetail paiementIrDetail){
        Employe employe = employeService.findById(paiementIrDetail.getEmploye().getId());
        if (employe == null) {
            return -1;
        }

        TauxIr tauxIr = tauxIrService.findById(paiementIrDetail.getTauxIr().getId());
        if(tauxIr == null){
            return -2;
        }
        double salaireBrut = paiementIrDetail.getSalaireBrute();
        double pourcentageIr = tauxIr.getPourcentage() / 100.0;
        double cotisationPatronale = salaireBrut * paiementIrDetail.getCotisationpatronel();
        double cotisationSalariale = salaireBrut * paiementIrDetail.getCotoisationsalarial();
        double salaireNet = salaireBrut * (1 - pourcentageIr) - cotisationSalariale;
        paiementIrDetail.setCotisationpatronel(cotisationPatronale);
        paiementIrDetail.setCotoisationsalarial(cotisationSalariale);
        paiementIrDetail.setSalaireNet(salaireNet);
        paiementIrDetailDao.save(paiementIrDetail);
        return 1;

    }

    @Override

    public PaiementIrDetail findById(long id) {
        return paiementIrDetailDao.findById(id);
    }

    @Override
    public List<PaiementIrDetail> findAll() {

        return paiementIrDetailDao.findAll();
    }
    @Override
    public void update(PaiementIrDetail paiementIrDetail ) {
        if (findById(paiementIrDetail.getId()) != null) {
            paiementIrDetailDao.save(paiementIrDetail);
        }
    }
    @Transactional
    @Override
    public int deleteById(long id) {
        return paiementIrDetailDao.deleteById(id);
    }
}
