package com.sample.postgress.mapper;

import com.sample.postgress.entity.Employee;
import com.sample.postgress.entity.EmployeeSkill;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeRowMapper implements RowMapper<Employee> {

	@Override
	public Employee mapRow(ResultSet rs, int arg1) throws SQLException {
		Employee emp = new Employee();
		emp.setEmployeeId(rs.getString("employeeId"));
		emp.setEmployeeName(rs.getString("employeeName"));
		emp.setEmployeeEmail(rs.getString("employeeEmail"));
		emp.setEmployeeAddress(rs.getString("employeeAddress"));

		EmployeeSkill skills = new EmployeeSkill();
		skills.setEmployeeId(rs.getString("employeeId"));
		skills.setSkillName(rs.getString("skillName"));
		skills.setExperience(rs.getInt("experience"));
		skills.setDescription(rs.getString("description"));
		emp.setEmployeeSkills(skills);
        return emp;
	}


}
