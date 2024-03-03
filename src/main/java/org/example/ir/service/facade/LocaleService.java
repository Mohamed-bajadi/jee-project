package org.example.ir.service.facade;

import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Locale;

public interface LocaleService {
    Locale findById(long id);

    @Transactional
    int deleteById(long id);

    List<Locale> findByRef(String Ref);

    List<Locale> findAll();

    int save(Locale locale);
}
