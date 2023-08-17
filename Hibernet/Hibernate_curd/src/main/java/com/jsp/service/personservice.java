package com.jsp.service;

import com.jsp.EmployeeDao.Dao;
import com.jsp.dto.EmployeeEntity;



public class personservice {

	Dao d=new Dao();
	
	public EmployeeEntity save(EmployeeEntity e) {
		return d.save(e);
	}

	public EmployeeEntity find(  int i)
	{
		return d.find(i);
	}
	public EmployeeEntity update(EmployeeEntity e) {
		return d.update(e);

	}

	public EmployeeEntity delete(int i) {
		return d.delete(i);

	}

	public EmployeeEntity selectall(EmployeeEntity e) {
		return d.selectall(e);

	}

	public EmployeeEntity SelectByName(String name,int i) {
		return d.SelectByName(name, i);

		
	}
}
