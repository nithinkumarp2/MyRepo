package com.jsp.controller;

import com.jsp.dto.EmployeeEntity;
import com.jsp.service.personservice;

public class find {

	public static void main(String[] args) {
		EmployeeEntity e1=new EmployeeEntity();
		personservice ps=new personservice();
		EmployeeEntity e=ps.find(6);
		if (e !=null) {
			System.out.println("EMPLOYEE ID   : "+e.getId());
			System.out.println("EMPLOYEE NAME : "+e.getName());
			System.out.println("EMPLOYEE AGE  : "+e.getAge());
		}else {
			System.out.println("CHECK THE DATA");
		}
		
	}
}
