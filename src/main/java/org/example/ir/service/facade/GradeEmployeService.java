package org.example.ir.service.facade;

import org.example.ir.bean.GradeEmploye;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface GradeEmployeService {


    GradeEmploye findByCode(String code);




    @Transactional
    int deleteByCode(String code);

    int save(GradeEmploye gradeEmploye);

    List<GradeEmploye> findAll();
}
