package org.example.ir.dao;

import org.example.ir.bean.Renovable;
import org.springframework.data.jpa.repository.JpaRepository;
<<<<<<< HEAD
import org.springframework.stereotype.Repository;

@Repository
=======

>>>>>>> 7d8b19906d5bd1e4f147065c5c8313a7f5182e6c
public interface RenovableDao extends JpaRepository<Renovable,Integer> {
    Renovable findRenovableById(Long id);
    int deleteRenovableById(Long id);
}
