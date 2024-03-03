package org.example.ir.dao;

import jakarta.transaction.Transactional;
import org.example.ir.bean.Locale;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface LocaleDao extends JpaRepository<Locale,Long> {
    Locale findById(long id);
    @Transactional
    int deleteById(long id) ;
    List<Locale> findByRef(String Ref);
}
