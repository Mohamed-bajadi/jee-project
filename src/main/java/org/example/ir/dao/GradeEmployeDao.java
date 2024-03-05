package org.example.ir.dao;

import org.example.ir.bean.GradeEmploye;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface GradeEmployeDao extends JpaRepository<GradeEmploye, Long> {

    GradeEmploye findByCode( String code);

    int deleteByCode( String code);



}
