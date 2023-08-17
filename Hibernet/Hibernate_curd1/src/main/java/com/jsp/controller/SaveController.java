package com.jsp.controller;

import com.jsp.Dto.EmployeeEntity;
import com.jsp.service.PersonService;

public class SaveController {

	public static void main(String[] args) {
		 EmployeeEntity e=new EmployeeEntity();
		 e.setId(2);
		 e.setName("kumar");
		 e.setAge(25);
		 PersonService ps=new PersonService();
		 e=ps.save(e);
		 
		 if (e !=null) {
			System.out.println("DATA SAVED SUCCESSFULLY");
		}
		 else {
			System.out.println("CHECK THE DATA");
		}
		 
		 
	}

}
