package com.jsp.service;

import java.util.List;

import com.jsp.dao.EmployeeDao;
import com.jsp.dto.EmployeeEntity;

public class EmployeeService {

	 EmployeeDao d=new EmployeeDao(); 
	public EmployeeEntity save(EmployeeEntity e)
	{
		return d.save(e);
	}
	
	public EmployeeEntity Find(int i) {
		 
		return d.find(i);
	} 
	
	public EmployeeEntity update(EmployeeEntity e)
	{
		return  d.update(e);
	}
	public EmployeeEntity Delete(EmployeeEntity e)
	{
		return d.Delete(e);
	}
	public List<EmployeeEntity> SelectAll()
	{
		return d.SelectAll();
	}
}
