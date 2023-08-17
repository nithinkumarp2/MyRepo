package com.jsp.controller;

import com.jsp.Dto.EmployeeEntity;
import com.jsp.service.PersonService;

public class FindController {

	public static void main(String[] args) {
		 EmployeeEntity e=new EmployeeEntity();
		 PersonService ps=new PersonService();
		 e=ps.Find(6);
		 
		 if (e != null) {
			System.out.println("USER ID : "+e.getId());
			System.out.println("USER NAME : "+e.getName());
			System.out.println("USER AGE : "+e.getAge());
		}
	}

}
