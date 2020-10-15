package com.sample.postgress.service;

import com.sample.postgress.dao.EmployeeSkillsDao;
import com.sample.postgress.entity.EmployeeSkill;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

@Component
public class EmployeeSkillServiceImpl implements EmployeeSkillService {
    @Resource
    EmployeeSkillsDao employeeDao;

    @Override
    public List<EmployeeSkill> findAll() {
        return employeeDao.findAll();
    }

    @Override
    public void insertEmployeeSkill(EmployeeSkill emp) {
        employeeDao.insertEmployee(emp);
    }

    @Override
    public void updateEmployeeSkill(EmployeeSkill emp) {
        employeeDao.updateEmployee(emp);
    }

    @Override
    public void executeUpdateEmployeeSkill(EmployeeSkill emp) {
        employeeDao.executeUpdateEmployee(emp);
    }

    @Override
    public void deleteEmployeeSkill(EmployeeSkill emp) {
        employeeDao.deleteEmployee(emp);
    }
}
