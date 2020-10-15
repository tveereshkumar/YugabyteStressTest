package com.sample.postgress.entity;

public class Employee {

	String employeeId;
	String employeeName;
	String employeeEmail;
	String employeeAddress;
	EmployeeSkill employeeSkill;

	public Employee() {

	}

	public Employee(String employeeId, String employeeName,
					String employeeEmail, String employeeAddress) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeEmail = employeeEmail;
		this.employeeAddress = employeeAddress;
	}

	public String getEmployeeEmail() {
		return employeeEmail;
	}
	public void setEmployeeEmail(String employeeEmail) {
		this.employeeEmail = employeeEmail;
	}
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmployeeAddress() {
		return employeeAddress;
	}
	public void setEmployeeAddress(String employeeAddress) {
		this.employeeAddress = employeeAddress;
	}

	public EmployeeSkill getEmployeeSkills() {
		return employeeSkill;
	}

	public void setEmployeeSkills(EmployeeSkill employeeSkill) {
		this.employeeSkill = employeeSkill;
	}
}
