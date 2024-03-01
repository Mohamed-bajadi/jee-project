package org.example.ir.service.Impl;

import org.example.ir.bean.GradeEmploye;
import org.example.ir.dao.GradeEmployeDao;
import org.example.ir.service.facade.GradeEmployeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GradeEmployeServiceImpl implements GradeEmployeService {
    @Autowired
    private GradeEmployeDao gradeEmployeDao;

    @Override
    @Transactional
    public GradeEmploye findByCode(String code) {
        return gradeEmployeDao.findByCode(code);
    }

    @Override
    public int deletByCode(String code) {
        return gradeEmployeDao.deletByCode(code);
    }
    @Override
    public int save(GradeEmploye gradeEmploye) {
        if (gradeEmploye.getCode()==null){
            return -1;
        }else if(gradeEmploye.getLibelle()==null){
            return -2;
        }else
            gradeEmployeDao.save(gradeEmploye);
        return 1;
    }
    @Override
    public List<GradeEmploye> findAll() {
        return gradeEmployeDao.findAll();
    }
}

