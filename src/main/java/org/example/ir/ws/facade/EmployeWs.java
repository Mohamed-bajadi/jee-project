package org.example.ir.ws.facade;

import org.example.ir.bean.Employe;
import org.example.ir.service.facade.EmployeService;
import org.example.ir.ws.converter.EmployeConverter;
import org.example.ir.ws.dto.EmployeDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employe/")
public class EmployeWs {
    @Autowired
    private EmployeConverter converter;

    @Autowired
    private EmployeService service;

    @GetMapping("id/{id}")
    public EmployeDto findById(@PathVariable long id) {
        Employe emp = service.findById(id);
        return converter.toDto(emp);
    }

    @DeleteMapping("id/{id}")
    @Transactional
    public int deleteById(@PathVariable long id) {
        return service.deleteById(id);
    }

    @GetMapping("firstname/{firstname}")
    public List<EmployeDto> findByFirstnameLike(@PathVariable String firstname) {
        List<Employe> emps = service.findByFirstnameLike(firstname);
        return converter.toDto(emps);
    }

    @GetMapping()
    public List<EmployeDto> findAll() {
        List<Employe> all = service.findAll();
        return converter.toDto(all);
    }

    @PostMapping()
    public int save(@RequestBody EmployeDto employeDto) {
        Employe emp = converter.toBean(employeDto);
        return service.save(emp);
    }

@GetMapping("societe/id/{id}")
    public List<EmployeDto> findEmployeBySocieteId(@PathVariable Long id) {
    List<Employe> employeBySocieteId = service.findEmployeBySocieteId(id);
    return converter.toDto(employeBySocieteId);
    }
}
