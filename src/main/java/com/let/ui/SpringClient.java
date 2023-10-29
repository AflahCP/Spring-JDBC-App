package com.let.ui;

import java.time.LocalDate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.let.config.ApplicationConfig;
import com.let.controller.EmployeeController;
import com.let.dto.Employee;
import com.let.service.EmployeeService;

public class SpringClient {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		
		Employee employee = new Employee();
		employee.setEmpId(1);
		employee.seteName("Aflah");
		employee.seteMail("Cp@hotmail.com");
		employee.setCreateDate(LocalDate.now());
		employee.setCreatedBy("Afi");
		
		EmployeeController employeeController = applicationContext.getBean(EmployeeController.class);
//		employeeController.addNewEmployee(employee);
		System.out.println("----------------------------------------------------------------");
		employeeController.getAllEmployeeInformation();
		((AbstractApplicationContext) applicationContext).close();
	}

}
