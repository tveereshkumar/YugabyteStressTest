package com.sample.postgress.controller;

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
    public String createEmployee(@RequestBody EmployeeSkill emp) {
        employeeSkillService.insertEmployeeSkill(emp);
        return "Successfully Inserted";
    }

    @PutMapping(value = "/updateEmpSkill")
    public String updateEmployee(@RequestBody EmployeeSkill emp) {
        employeeSkillService.updateEmployeeSkill(emp);
        return "Successfully Updated";
    }

    @PutMapping(value = "/executeUpdateEmpSkill")
    public String executeUpdateEmployee(@RequestBody EmployeeSkill emp) {
        employeeSkillService.executeUpdateEmployeeSkill(emp);
        return "Successfully Updated";
    }

    @DeleteMapping(value = "/deleteEmpSkillById")
    public String deleteEmployee(@RequestBody EmployeeSkill emp) {
        employeeSkillService.deleteEmployeeSkill(emp);
        return "Successfully Deleted";
    }
}
