package org.example.ir.dao;

import org.example.ir.bean.Renovable;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

@Repository

public interface RenovableDao extends JpaRepository<Renovable,Integer> {
    Renovable findRenovableById(Long id);
    int deleteRenovableById(Long id);
}
