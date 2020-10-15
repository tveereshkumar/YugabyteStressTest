package com.sample.postgress.mapper;

import com.sample.postgress.entity.EmployeeSkill;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeSkillRowMapper implements RowMapper<EmployeeSkill> {

    @Override
    public EmployeeSkill mapRow(ResultSet rs, int i) throws SQLException {
        EmployeeSkill ems = new EmployeeSkill();
        ems.setEmployeeId(rs.getString("employeeId"));
        ems.setSkillName(rs.getString("skillName"));
        ems.setExperience(rs.getInt("experience"));
        ems.setDescription(rs.getString("description"));
        return ems;
    }
}
