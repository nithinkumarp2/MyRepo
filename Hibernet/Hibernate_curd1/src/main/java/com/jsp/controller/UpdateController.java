package com.jsp.controller;

import com.jsp.Dao.EmplyeeDao;
import com.jsp.Dto.EmployeeEntity;
import com.jsp.service.PersonService;

public class UpdateController {

	 	public static void main(String[] args) {
 		 EmplyeeDao dao=new EmplyeeDao();
		PersonService ps = new PersonService();
		EmployeeEntity e1=ps.Find(1);
		EmployeeEntity  e2=ps.update(e1);
		e2.setName("nithinkumar");
//		e2.setAge(22);
 		if (e2!=null) 
		 {
			System.out.println("UPDATED SUCCESSFULLY");
		} else
			System.out.println("CHECK THE DATA");

	}
}
