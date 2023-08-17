package com.jsp.controller;

import com.jsp.dto.EmployeeEntity;
import com.jsp.service.personservice;

public class DeleteController {

	public static void main(String[] args) {
		 
		EmployeeEntity e=new EmployeeEntity();
		
		personservice ps=new personservice();
		
		e=ps.delete(1);
		
		if (e !=null) {
			
			System.err.println("DELETED SUCCESSFULLY");
		}else
		{
			System.out.println("PLS CHECK THE DATA");
		}
		
	}

}
