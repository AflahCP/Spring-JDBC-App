package com.let.service;

import com.let.dto.Employee;

public interface EmployeeService {
	public boolean createNewEmployee(Employee employee);
	public void retrieveAllEmployees();
}
