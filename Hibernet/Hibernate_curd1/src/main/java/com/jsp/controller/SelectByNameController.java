package com.jsp.controller;

import java.util.List;

import com.jsp.Dao.EmplyeeDao;
import com.jsp.Dto.EmployeeEntity;
import com.jsp.service.PersonService;

public class SelectByNameController {

	public static void main(String[] args) {

		EmplyeeDao dao=new EmplyeeDao();
		EmployeeEntity e=new EmployeeEntity();
		PersonService ps=new PersonService();
		e=ps.SelectByName(e);
		dao.q.setParameter(2, "kumar");
		List<EmployeeEntity> list=dao.q.getResultList();
		
		
		for (EmployeeEntity emp : list) {
			System.out.println("USER ID   : "+emp.getId());
			System.out.println("USER NAME : "+emp.getName());
			System.out.println("USER AGE  : "+emp.getAge());
		}
	}

}
