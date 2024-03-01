package org.example.ir.ws.facade;

import org.example.ir.bean.GradeEmploye;
import org.example.ir.service.Impl.GradeEmployeServiceImpl;
import org.example.ir.ws.converter.GradeEmployeConverter;
import org.example.ir.ws.dto.GradeEmployeDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/paiemnetdetail/")
public class GradeEmployeWs {
    @Autowired
    GradeEmployeServiceImpl gradeEmployeService;
    @Autowired
    GradeEmployeConverter converter;
    @GetMapping("code/{code}")
    public GradeEmployeDto findByCode(@PathVariable String code){
        GradeEmploye gradeEmploye= gradeEmployeService.findByCode(code);
        return converter.toDto(gradeEmploye);
    }
    @Transactional
    @DeleteMapping("code/{code}")
    public int deletByCode(@PathVariable String code) {
        return gradeEmployeService.deletByCode(code);
    }
    @PostMapping("")
    public int save(@RequestBody GradeEmployeDto dto) {
        GradeEmploye gradeEmploye=converter.toBean(dto);
        return gradeEmployeService.save(gradeEmploye);
    }
    @GetMapping("")
    public List<GradeEmployeDto> findAll() {
        List<GradeEmploye> all=gradeEmployeService.findAll();
        return converter.toDto(all);


    }
}
