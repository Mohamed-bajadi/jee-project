package org.example.ir.service.impl;

import org.example.ir.bean.EmployeSalaireHistory;
import org.example.ir.dao.EmloyeSalaireHistoryDao;
import org.example.ir.service.facade.EmployeSalaireHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeSalaireHistoryServiceImpl implements EmployeSalaireHistoryService {
    @Autowired
    private EmloyeSalaireHistoryDao empDoa;
    @Override
    public EmployeSalaireHistory findByEmployeId(Long id) {
        return empDoa.findByEmployeId(id);
    }

@Override
    public List<EmployeSalaireHistory> findAll() {
        return empDoa.findAll();
    }


@Override

    public int save(EmployeSalaireHistory employeSalaireHistory) {

        if (employeSalaireHistory.getMoisDepart() == null || employeSalaireHistory.getMoisFin() == null
                || employeSalaireHistory.getAnneeDepart() == null || employeSalaireHistory.getAnneeFin() == null
                || employeSalaireHistory.getSalaireBrut() == null || employeSalaireHistory.getSociete() == null
                || employeSalaireHistory.getEmploye() == null) {
           return -1;
        }

        if (employeSalaireHistory.getMoisFin().isBefore(employeSalaireHistory.getMoisDepart())
                || employeSalaireHistory.getAnneeFin().isBefore(employeSalaireHistory.getAnneeDepart())) {
           return -2;
        }


        empDoa.save(employeSalaireHistory);
        return 1;
    }
}
