package org.example.ir.service.facade;

import org.example.ir.bean.Locale;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface LocaleService {
    Locale findById(long id);

    @Transactional
    int deleteById(long id);

    List<Locale> findByRef(String Ref);


    int save(Locale locale);
}
