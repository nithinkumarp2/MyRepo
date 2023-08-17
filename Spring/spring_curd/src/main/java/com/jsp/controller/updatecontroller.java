package com.jsp.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jsp.Dto.Employee;
import com.jsp.service.Employeeservice;
import com.jsp.util.myconfig;

public class updatecontroller {
	public static void main(String[] args) {
		ApplicationContext app = new AnnotationConfigApplicationContext(myconfig.class);
		Employee employee = (Employee) app.getBean("employee");
		employee.setId(1);
		employee.setName("nithinkumar");
		employee.setAge(26);

		Employeeservice service = (Employeeservice) app.getBean("employeeservice");
		Employee employee2 = service.update(employee);
		if (employee2 != null) {
			System.out.println("updated successfully");
		} else {
			System.out.println("updated failed");
		}
	}
}
