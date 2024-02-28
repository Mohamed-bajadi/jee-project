package org.example.ir.dao;

import org.example.ir.bean.EmployeSalaireHistory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;

@Repository
public interface EmloyeSalaireHistoryDao extends JpaRepository<EmployeSalaireHistory,Long> {
    EmployeSalaireHistory findByAnneeDepartBetween(LocalDate date1, LocalDate date2);
   @Transactional
    EmployeSalaireHistory deleteByRef(String ref);
   EmployeSalaireHistory findByEmployeId(Long id);

}
