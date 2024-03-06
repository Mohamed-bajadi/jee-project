package org.example.ir.dao;

import org.example.ir.bean.Renovable;
import org.springframework.data.jpa.repository.JpaRepository;
<<<<<<< HEAD
import org.springframework.stereotype.Repository;

@Repository
=======

>>>>>>> 7d8b199 (ghi kankhrb9u)
public interface RenovableDao extends JpaRepository<Renovable,Integer> {
    Renovable findRenovableById(Long id);
    int deleteRenovableById(Long id);
}
