package com.jsp.controller;

import com.jsp.dto.EmployeeEntity;
import com.jsp.service.personservice;

public class save {

	public static void main(String[] args) {
		 EmployeeEntity e=new EmployeeEntity();
		 e.setId(6);
		 e.setName("kumar");
		 e.setAge(25);
		 personservice ps=new personservice();
		 e=ps.save(e);
		 
		 if (e !=null) {
			System.out.println("DATA SAVED SUCCESSFULLY");
		}
		 else {
			System.out.println("CHECK THE DATA");
		}
		 
	}
}
