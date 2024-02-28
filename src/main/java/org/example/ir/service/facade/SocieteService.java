package org.example.ir.service.facade;

import org.example.ir.bean.Societe;

public interface SocieteService {

    Societe findByIce(String ice);

    int deleteByIce(String ice);

    int save(Societe s);
}
