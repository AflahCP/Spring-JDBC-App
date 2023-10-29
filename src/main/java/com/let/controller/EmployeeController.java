package com.let.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.let.dto.Employee;
import com.let.service.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	public void addNewEmployee(Employee employee) {
		boolean insertStatus = employeeService.createNewEmployee(employee);
		
		if(insertStatus) System.out.println("Employee created successfully");
		else System.out.println("Failed to create Employee");
	}
	
	public void getAllEmployeeInformation() {
		employeeService.retrieveAllEmployees();
	}
}
