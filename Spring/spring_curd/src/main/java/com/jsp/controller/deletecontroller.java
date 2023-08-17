package com.jsp.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.jsp.Dto.Employee;
import com.jsp.service.Employeeservice;
import com.jsp.util.myconfig;

public class deletecontroller {
	 
public static void main(String[] args) {
	ApplicationContext app=new AnnotationConfigApplicationContext(myconfig.class);
	Employee employee=(Employee) app.getBean("employee");
	employee.setId(2);
	Employeeservice service=(Employeeservice) app.getBean("employeeservice");
	service.delete(employee);
	
	if (employee!=null) {
		System.out.println("deleted successfully");
	}
	else
	{
		System.out.println("deleted failed");
	}
}
}
