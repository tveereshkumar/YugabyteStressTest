package com.sample.postgress.util;

import com.sample.postgress.entity.Employee;
import com.sample.postgress.entity.EmployeeSkill;

import java.util.Random;

public class MockData {
    public static int employeeIdRand = 0;
    public static Random employeeRand = new Random(10);
    public static Random employeeExperienceRand = new Random(100);

    public static Employee getMockEmployee(){
        Employee emp = new Employee();
        String empId = getEmployeeIdRand();
        emp.setEmployeeId(empId);
        emp.setEmployeeName(EmployeeUtil.employeeName.get(employeeRand.nextInt()));
        emp.setEmployeeEmail(EmployeeUtil.employeeEmail.get(employeeRand.nextInt()));
        emp.setEmployeeAddress(EmployeeUtil.employeeAddress.get(employeeRand.nextInt()));
        return emp;
    }

    public static EmployeeSkill getMockEmployeeSkill(){
        EmployeeSkill skills = new EmployeeSkill();
        skills.setEmployeeId("0");
        skills.setSkillName(EmployeeUtil.employeeSkill.get(employeeRand.nextInt()));
        skills.setExperience(employeeExperienceRand.nextInt());
        skills.setDescription("Extremely skill & highly motivated & very much interested in software engineering");
        return skills;
    }

    public static String getEmployeeIdRand() {
        return String.valueOf(employeeIdRand++);
    }
}
