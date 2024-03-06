package org.example.ir.service.Impl;

import org.example.ir.bean.GradeEmploye;
import org.example.ir.dao.GradeEmployeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GradeEmployeServiceImpl implements org.example.ir.service.facade.GradeEmployeService {
    @Autowired
    private GradeEmployeDao gradeEmployeDao;

    @Override
    public GradeEmploye findByCode(String code) {
        return gradeEmployeDao.findByCode(code);
    }

    @Override
    @Transactional
    public int deleteByCode(String code) {
        return gradeEmployeDao.deleteByCode(code);
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

