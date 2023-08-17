 package com.jsp.controller;

import java.util.List;

import com.jsp.EmployeeDao.Dao;
import com.jsp.dto.EmployeeEntity;
import com.jsp.service.personservice;

public class SelectAllController {

	public static void main(String[] args) {
		Dao d=new Dao();
		EmployeeEntity e=new EmployeeEntity();
		personservice ps=new personservice();
		
		e=ps.selectall(e);
		List<EmployeeEntity> list 	=d.q.getResultList();
		//= ((Object) new Dao().q).getResultList();
		
		for (EmployeeEntity emp : list)  {
			System.out.println("USER ID : "+emp.getId());
			System.out.println("USER NAME : "+emp.getName());
			System.out.println("USER AGE : "+emp.getAge());
			System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		}
		 
	}
}
