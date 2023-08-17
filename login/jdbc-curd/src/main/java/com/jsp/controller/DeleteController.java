package com.jsp.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.Dto.Person;
import com.jsp.service.PersonService;

public class DeleteController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		int id = Integer.parseInt(req.getParameter("id"));
		
		Person p=new Person();
		PersonService service=new  PersonService();
		service.DeletePerson(id);
		
		if ( p!=null)
		{
			service.UpdatePerson(p);
			resp.getWriter().println("data delete successfully");
		}
		else
		{
			resp.getWriter().println("data delete failed");
		}
	}
}
