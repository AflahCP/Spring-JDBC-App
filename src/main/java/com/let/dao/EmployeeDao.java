package com.let.dao;

import java.util.List;
import java.util.Map;

import com.let.dto.Employee;

public interface EmployeeDao {
	public boolean createEmployee(Employee employee);
	public List<Map<String, Object>> getAllEmployees();
}
