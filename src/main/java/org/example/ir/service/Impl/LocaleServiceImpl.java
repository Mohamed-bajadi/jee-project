package org.example.ir.service.Impl;

import org.example.ir.bean.Locale;
import org.example.ir.service.facade.LocaleService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocaleServiceImpl implements LocaleService {
    @Override
    public Locale findById(long id) {
        return null;
    }

    @Override
    public int deleteById(long id) {
        return 0;
    }

    @Override
    public List<Locale> findByRef(String Ref) {
        return null;
    }

    @Override
    public int save(Locale locale) {
        return 0;
    }
}
