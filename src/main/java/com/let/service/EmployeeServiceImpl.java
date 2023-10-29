package com.let.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.let.dao.EmployeeDao;
import com.let.dto.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;
	
	@Override
	public boolean createNewEmployee(Employee employee) {
		return employeeDao.createEmployee(employee);
	}

	@Override
	public void retrieveAllEmployees() {
		List<Map<String, Object>> allEmployees = employeeDao.getAllEmployees();
		System.out.println("List:::::" + allEmployees);
		
		allEmployees.stream().forEach(map -> {
			map.entrySet().stream().forEach(entry -> {
				System.out.println(entry.getKey() + "--->" + entry.getValue());
			});
			System.out.println();
		});
	}

}
