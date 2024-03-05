package org.example.ir.service.facade;

import org.example.ir.bean.Employe;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface EmployeService {
    Employe findById(long id);

    @Transactional
    int deleteById(long id);

    List<Employe> findByFirstnameLike(String firstname);

    List<Employe> findAll();



    int save(Employe emp);
}
