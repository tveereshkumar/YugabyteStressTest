package com.sample.postgress.dao;

import com.sample.postgress.entity.Employee;

import java.util.List;

public interface EmployeeFullDao {

    List<Employee> findAll();
}
