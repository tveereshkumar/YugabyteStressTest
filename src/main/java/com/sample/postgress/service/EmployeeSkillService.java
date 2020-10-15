package com.sample.postgress.service;

import com.sample.postgress.entity.Employee;
import com.sample.postgress.entity.EmployeeSkill;

import java.util.List;

public interface EmployeeSkillService {

    List<EmployeeSkill> findAll();

    void insertEmployeeSkill(EmployeeSkill emp);

    void updateEmployeeSkill(EmployeeSkill emp);

    void executeUpdateEmployeeSkill(EmployeeSkill emp);

    void deleteEmployeeSkill(EmployeeSkill emp);
}
