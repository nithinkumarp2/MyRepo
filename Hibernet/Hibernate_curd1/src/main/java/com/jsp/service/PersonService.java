package com.jsp.service;

import com.jsp.Dao.EmplyeeDao;
import com.jsp.Dto.EmployeeEntity;

public class PersonService {

	 EmplyeeDao d=new EmplyeeDao(); 
	public EmployeeEntity save(EmployeeEntity e)
	{
		return d.save(e);
	}
	
	public EmployeeEntity Find(int i) {
		 
		return d.find(i);
	} 
	public EmployeeEntity update(EmployeeEntity e)
	{
		return d.update(e);
	}
	public EmployeeEntity Delete(EmployeeEntity e)
	{
		return d.Delete(e);
	}
	
	public EmployeeEntity SelectAll(EmployeeEntity e)
	{
		return d.selectAll(e);
	}
	
	public EmployeeEntity SelectByName(EmployeeEntity e)
	{
		return d.SelectByName(e);
	}
}
