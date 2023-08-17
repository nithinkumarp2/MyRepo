package com.jsp.controller;

import com.jsp.EmployeeDao.Dao;
import com.jsp.dto.EmployeeEntity;
import com.jsp.service.personservice;

public class update {

	 
	
	public static void main(String[] args) {
		Dao d=new Dao();
		 personservice ps=new personservice();
		  EmployeeEntity e=new EmployeeEntity();
 		 EmployeeEntity e2=d.em.find(EmployeeEntity.class , e.getId());
  		//   e2=ps.find(3);
	 	EmployeeEntity  e1=ps.update(e);
	 	 e1.setName("NITHINKUMAR");
 		if (e1 !=null)
		{
			System.out.println("DATA UPDATED");
		}
 		else
			System.out.println("CHECK THE VALUE");
	}
}
