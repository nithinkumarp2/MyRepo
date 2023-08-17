package com.jsp.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.Dao.PersonDao;
import com.jsp.Dto.Person;
import com.jsp.service.PersonService;

public class SaveController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		 
			int id = Integer.parseInt(req.getParameter("id"));
			String name = req.getParameter("name");
			int age = Integer.parseInt(req.getParameter("age"));
			String email = req.getParameter("email");
			String password = req.getParameter("pass");
			Person p = new Person();

			p.setId(id);
			p.setName(name);
			p.setAge(age);
			p.setEmail(email);
			p.setPassword(password);
			PersonService service = new PersonService();

		 	if ( p !=null)
			{
				service.SavePerson(p);
				resp.getWriter().println("data inserted successfully");
			}
			else
			{
				resp.getWriter().println("data inserted failed");
			}
		 
	}
}
