package com.jsp.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jsp.Dto.Employee;
import com.jsp.service.Employeeservice;
import com.jsp.util.myconfig;

public class Testsave {

	public static void main(String[] args) {
		ApplicationContext app=new AnnotationConfigApplicationContext(myconfig.class);
		Employee employee=(Employee) app.getBean("employee");
		employee.setId(1);
		employee.setName("nithin");
		employee.setAge(22);
		
		
		Employeeservice  service=(Employeeservice) app.getBean("employeeservice");
	    Employee employee1=service.saveEmployee(employee);
	        if (employee1!=null) {
				System.out.println("data saved");
			}
	        else
	        {
	        	System.out.println("data not saved");
	        }
	}
}
