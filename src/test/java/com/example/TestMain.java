package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.DTO.EmployeeDTO;
import com.service.EmployeeManager;

public class TestMain {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext("applicationContext.xml");
        EmployeeManager manager = (EmployeeManager) context.getBean("employeeManager");
  
        manager.getEmployeeById(1);
        manager.createEmployee(new EmployeeDTO());
	}

}
