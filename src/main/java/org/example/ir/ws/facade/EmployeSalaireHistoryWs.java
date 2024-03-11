package org.example.ir.ws.facade;

import org.example.ir.bean.EmployeSalaireHistory;
import org.example.ir.service.impl.EmployeSalaireHistoryServiceImpl;
import org.example.ir.ws.converter.EmployeSalaireHistoryConverter;
import org.example.ir.ws.dto.EmployeSalaireHistoryDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employeSalaireHistory")
public class EmployeSalaireHistoryWs {
    @Autowired
    private EmployeSalaireHistoryConverter converter;
@GetMapping("/id/{id}")
    public EmployeSalaireHistoryDto findByEmployeId(@PathVariable Long id) {
    EmployeSalaireHistory byEmployeId = service.findByEmployeId(id);
    return converter.toDto(byEmployeId);
}
@GetMapping

    public List<EmployeSalaireHistoryDto> findAll() {
    List<EmployeSalaireHistory> all = service.findAll();
    return converter.toDto(all);
}
@PostMapping
    public int save(@RequestBody EmployeSalaireHistoryDto employeSalaireHistory) {
        return service.save(converter.toBean(employeSalaireHistory));
    }

    @Autowired
    private EmployeSalaireHistoryServiceImpl service;

}
