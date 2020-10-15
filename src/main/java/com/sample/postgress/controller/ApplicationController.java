package com.sample.postgress.controller;

import com.sample.postgress.entity.Employee;
import com.sample.postgress.service.EmployeeService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/employee")
public class ApplicationController {

	@Resource 
	EmployeeService employeeService;
	
	@GetMapping(value = "/employeeList")
	public List<Employee> getEmployees() {
		return employeeService.findAll();
	}
	
	@PostMapping(value = "/createEmp")
	public String createEmployee(@RequestBody Employee emp) {
		 employeeService.insertEmployee(emp);
		 return "Successfully Inserted";
	}
	@PutMapping(value = "/updateEmp")
	public String updateEmployee(@RequestBody Employee emp) {
		 employeeService.updateEmployee(emp);
		return "Successfully Updated";
	}
	@PutMapping(value = "/executeUpdateEmp")
	public String executeUpdateEmployee(@RequestBody Employee emp) {
		 employeeService.executeUpdateEmployee(emp);
		return "Successfully Updated";
	}
	
	@DeleteMapping(value = "/deleteEmpById")
	public String deleteEmployee(@RequestBody Employee emp) {
		 employeeService.deleteEmployee(emp);
		return "Successfully Deleted";
	}
	
	
}
