package com.jsp.service;

import javax.servlet.http.HttpServlet;

import com.jsp.Dao.EmployeeDao;
import com.jsp.Dto.EmployeeDto;

public class EmployeeService {
 
	EmployeeDao dao=new EmployeeDao();
	
	public EmployeeDto SaveDetails(EmployeeDto employee) {
		return dao.SaveDetails(employee);
		
	}
	public EmployeeDto UpdateEmployee(EmployeeDto employee)
	{
		return dao.UpdateEmployee(employee);
	}
	
	public EmployeeDto DeleteEmployee(int i)
	{
		return dao.Deleteemployee(i);
	}
 public EmployeeDto GetAllDetails()
 {
	 return dao.GetAllDetails();
 }

	 

	 
		
	
}
 