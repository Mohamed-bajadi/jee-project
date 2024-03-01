package org.example.ir.dao;

import org.example.ir.bean.Societe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SocieteDao extends JpaRepository<Societe, Long> {

    Societe findByIce(String ice);
    int deleteByIce(String ice);
    Societe findById(long id);

}
