package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.DTO.EmployeeDTO;
import com.service.EmployeeManageImpl;
import com.service.EmployeeManager;



@SpringBootApplication
public class SpringAopexApplication {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        EmployeeManager manager = (EmployeeManager) context.getBean("employeeManager");
  
        manager.getEmployeeById(1);
        manager.createEmployee(new EmployeeDTO());
		
		
		
	}
}
