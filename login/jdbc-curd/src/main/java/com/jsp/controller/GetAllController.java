package com.jsp.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.Dao.PersonDao;
import com.jsp.Dto.Person;
import com.jsp.service.PersonService;

public class GetAllController extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
 		List<Person> list =new ArrayList<>();
		Person p=new Person();
		PersonService service=new PersonService();
		 service. GetAllPerson();
		req.setAttribute("data",list);
		try {
			while(PersonDao.rs1.next()) {
			resp.getWriter().println("ID : "+PersonDao.rs1.getInt(1)+" NAME : "+PersonDao.rs1.getString(2)+" AGE : "+PersonDao.rs1.getInt(3)+" EMAIL : "+PersonDao.rs1.getString(4)+" PASSWORD : "+PersonDao.rs1.getString(5));
//		resp.getWriter().print(list);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
