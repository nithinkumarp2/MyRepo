package com.jsp.controller;

import com.jsp.Dto.EmployeeEntity;
import com.jsp.service.PersonService;

public class DeleteController {

	public static void main(String[] args) {
//		 EmployeeEntity e=new EmployeeEntity();
		 PersonService ps=new PersonService();
		 EmployeeEntity e1=ps.Find(5);
		 e1=ps.Delete(e1);
		 
		 if (e1!=null) {
			System.out.println("DELETED SUCCESSFULLY");
		}
		 else {
			System.out.println("CHECK THE DATA YOU ENTERED");
		}
		 
	}

}
