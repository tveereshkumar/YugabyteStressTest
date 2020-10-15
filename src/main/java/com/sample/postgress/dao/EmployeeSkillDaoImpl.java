package com.sample.postgress.dao;

import com.sample.postgress.entity.EmployeeSkill;
import com.sample.postgress.mapper.EmployeeSkillRowMapper;
import com.sample.postgress.util.MockData;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class EmployeeSkillDaoImpl implements EmployeeSkillsDao {
    NamedParameterJdbcTemplate template;

    public EmployeeSkillDaoImpl(NamedParameterJdbcTemplate template) {
        this.template = template;
    }

    @Override
    public List<EmployeeSkill> findAll() {
        return template.query("select * from employee_skill", new EmployeeSkillRowMapper());
    }

    @Override
    public void insertEmployee(EmployeeSkill emp) {
        final String sql = "insert into employee_skill(employeeId, skillName , experience, description) values(:employeeId,:skillName,:experience,:description)";
        if (emp == null)
            emp = MockData.getMockEmployeeSkill();
        KeyHolder holder = new GeneratedKeyHolder();
        SqlParameterSource param = new MapSqlParameterSource()
                .addValue("employeeId", emp.getEmployeeId())
                .addValue("skillName", emp.getSkillName())
                .addValue("experience", emp.getExperience())
                .addValue("description", emp.getDescription());
        template.update(sql,param, holder);
    }

    @Override
    public void updateEmployee(EmployeeSkill emp) {
        if (emp == null)
            emp = MockData.getMockEmployeeSkill();
        final String sql = "update employee_skill set skillName=:skillName, experience=:experience, description=:description where employeeId=:employeeId";
        KeyHolder holder = new GeneratedKeyHolder();
        SqlParameterSource param = new MapSqlParameterSource()
                .addValue("employeeId", emp.getEmployeeId())
                .addValue("skillName", emp.getSkillName())
                .addValue("experience", emp.getExperience())
                .addValue("description", emp.getDescription());
        template.update(sql,param, holder);
    }

    @Override
    public void executeUpdateEmployee(EmployeeSkill emp) {
        if (emp == null)
            emp = MockData.getMockEmployeeSkill();
        final String sql = "update employee_skill set skillName=:skillName, experience=:experience, description=:description where employeeId=:employeeId";

        Map<String,Object> map=new HashMap<String,Object>();
        map.put("employeeId", emp.getEmployeeId());
        map.put("skillName", emp.getSkillName());
        map.put("experience", emp.getExperience());
        map.put("description", emp.getDescription());

        template.execute(sql,map,new PreparedStatementCallback<Object>() {
            @Override
            public Object doInPreparedStatement(PreparedStatement ps)
                    throws SQLException, DataAccessException {
                return ps.executeUpdate();
            }
        });
    }

    @Override
    public void deleteEmployee(EmployeeSkill emp) {
        if (emp == null)
            emp = MockData.getMockEmployeeSkill();
        final String sql = "delete from employee_skill where employeeId=:employeeId";

        Map<String,Object> map=new HashMap<String,Object>();
        map.put("employeeId", emp.getEmployeeId());

        template.execute(sql,map,new PreparedStatementCallback<Object>() {
            @Override
            public Object doInPreparedStatement(PreparedStatement ps)
                    throws SQLException, DataAccessException {
                return ps.executeUpdate();
            }
        });
    }
}
