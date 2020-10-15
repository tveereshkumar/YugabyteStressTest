package com.sample.postgress.dao;

import com.sample.postgress.entity.EmployeeSkill;

import java.util.List;

public interface EmployeeSkillsDao {

    List<EmployeeSkill> findAll();

    void insertEmployee(EmployeeSkill emp);

    void updateEmployee(EmployeeSkill emp);

    void executeUpdateEmployee(EmployeeSkill emp);

    public void deleteEmployee(EmployeeSkill emp);
}
