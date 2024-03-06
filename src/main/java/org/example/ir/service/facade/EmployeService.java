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

<<<<<<< HEAD

=======
    List<Employe> findBySocieteId(long societeId);
>>>>>>> 87810a16659f0ab283ac81a4055df292f81e1bc2

    int save(Employe emp);
}
