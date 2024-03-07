package org.example.ir.service.facade;

import org.example.ir.bean.EmployeSalaireHistory;
import org.example.ir.dao.EmloyeSalaireHistoryDao;
import org.springframework.stereotype.Service;

import java.util.List;


public interface EmployeSalaireHistoryService {

    EmployeSalaireHistory findByEmployeId(Long id);

    List<EmployeSalaireHistory> findAll();

    int save(EmployeSalaireHistory employeSalaireHistory);
}
