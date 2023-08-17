package com.jsp.controller;

import java.util.List;

import com.jsp.Dao.EmplyeeDao;
import com.jsp.Dto.EmployeeEntity;
import com.jsp.service.PersonService;

public class SelectAllController {

	public static void main(String[] args) {
		EmplyeeDao dao=new EmplyeeDao();
		 EmployeeEntity e1=new EmployeeEntity();
		 PersonService ps=new PersonService();
		
		e1=ps.SelectAll(e1);
		 List<EmployeeEntity> list=dao.q.getResultList();
		 
		 for (EmployeeEntity emp : list) {
			System.out.println("USER ID   : "+emp.getId());
			System.out.println("USER NAME : "+emp.getName());
			System.out.println("USER AGE  : "+emp.getAge());
			System.out.println(">>>>>>>>>>>>>>>>>>>>");
		}
	}

}
