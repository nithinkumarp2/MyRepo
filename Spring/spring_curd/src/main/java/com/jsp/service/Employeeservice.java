package com.jsp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import com.jsp.Dao.EmployeeDao;
import com.jsp.Dto.Employee;
@Component
public class Employeeservice {

	@Autowired
	EmployeeDao dao;
	
	public Employee saveEmployee(Employee employee)
	{
		return dao.saveEmployee(employee);
		
	}
	 
	public Employee getAllDetails()
	{
		return dao.getAllDetails();
	}
	 
	public Employee update(Employee employee)
	{
		return dao.update(employee);
	}
	 
	public Employee delete(Employee employee)
	{
		return dao.delete(employee);
	}
}
