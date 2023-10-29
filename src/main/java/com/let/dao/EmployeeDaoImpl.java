package com.let.dao;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.let.dto.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Override
	public boolean createEmployee(Employee employee) {
		int insertCount = jdbcTemplate.update("insert into employees values (?,?,?,?,?)", new Object[] {employee.getEmpId(),
				employee.geteName(),
				employee.geteMail(),
				employee.getCreateDate(),
				employee.getCreatedBy()});
		return insertCount > 0;
	}

	@Override
	public List<Map<String, Object>> getAllEmployees() {
		List<Map<String, Object>> employees = jdbcTemplate.queryForList("select * from employees");
		return employees;
	}

}
