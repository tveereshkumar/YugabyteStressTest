package com.sample.postgress.controller;

import com.sample.postgress.entity.Employee;
import com.sample.postgress.entity.EmployeeSkill;
import com.sample.postgress.service.EmployeeSkillService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeSkillController {

    @Resource
    EmployeeSkillService employeeSkillService;

    @GetMapping(value = "/employeeSkillList")
    public List<EmployeeSkill> getEmployees() {
        return employeeSkillService.findAll();
    }

    @PostMapping(value = "/createEmpSkill")
    public void createEmployee(@RequestBody EmployeeSkill emp) {
        employeeSkillService.insertEmployeeSkill(emp);
    }

    @PutMapping(value = "/updateEmpSkill")
    public void updateEmployee(@RequestBody EmployeeSkill emp) {
        employeeSkillService.updateEmployeeSkill(emp);
    }

    @PutMapping(value = "/executeUpdateEmpSkill")
    public void executeUpdateEmployee(@RequestBody EmployeeSkill emp) {
        employeeSkillService.executeUpdateEmployeeSkill(emp);
    }

    @DeleteMapping(value = "/deleteEmpSkillById")
    public void deleteEmployee(@RequestBody EmployeeSkill emp) {
        employeeSkillService.deleteEmployeeSkill(emp);
    }
}
