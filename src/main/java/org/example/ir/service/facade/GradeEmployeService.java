package org.example.ir.service.facade;

import org.example.ir.bean.GradeEmploye;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface GradeEmployeService {


    GradeEmploye findByCode(String code);

<<<<<<< HEAD
=======



>>>>>>> efdcd1be644e6e7787ea751540e66fb66edad8cb
    @Transactional
    int deleteByCode(String code);

    int save(GradeEmploye gradeEmploye);

    List<GradeEmploye> findAll();
}
