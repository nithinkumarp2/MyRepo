package com.jsp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jsp.Dao.EmployeeDao;
import com.jsp.Dto.Employee;
import com.jsp.service.Employeeservice;
import com.jsp.util.myconfig;

public class GetAllDetailscontroller {
	 
	public static void main(String[] args) {
		
		ApplicationContext app=new AnnotationConfigApplicationContext(myconfig.class);
		Employee employee=(Employee) app.getBean("employee");
		
		Employeeservice service=(Employeeservice) app.getBean("employeeservice");
		service.getAllDetails();
		

		//List<Employee> list  ;
		for (Employee employee1 : EmployeeDao.list) {
			System.out.println("employee id : "+employee1.getId());
			System.out.println("employee name : "+employee1.getName());
			System.out.println("employee age : "+employee1.getAge());
	
		 
		 	}
}
}
