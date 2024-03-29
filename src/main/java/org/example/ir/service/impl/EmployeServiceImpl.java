package org.example.ir.service.impl;

import org.example.ir.bean.Employe;
import org.example.ir.bean.Societe;
import org.example.ir.dao.EmployeDao;
import org.example.ir.service.facade.EmployeService;
import org.example.ir.service.facade.SocieteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EmployeServiceImpl implements EmployeService {
    @Autowired
    private EmployeDao employeDao;
    @Autowired
    private SocieteService service;

    @Override
    public Employe findById(long id) {
        return employeDao.findById(id);
    }

    @Override

    @Transactional
    public int deleteById(long id) {
        return employeDao.deleteById(id);
    }

@Override
    public List<Employe> findByFirstnameLike(String firstname) {
        return employeDao.findByFirstnameLike(firstname);
    }
    @Override
    public List<Employe> findAll() {
        return employeDao.findAll();
    }



    @Override
    public int save(Employe emp) {
     String ice =  emp.getSociete().getIce();
     Societe sc = service.findByIce(ice);
        if (sc != null) {
            service.save(sc);
            emp.setSociete(sc);
        }

       if (findById(emp.getId()) != null) {
            return -1;
        } else if (emp.getFirstname()==null && emp.getLastname()==null) {
            return -2 ;
        }else
        {

            employeDao.save(emp);
            return 1;
        }

    }
@Override
    public List<Employe> findEmployeBySocieteId(Long id) {
        return employeDao.findEmployeBySocieteId(id);
    }
}