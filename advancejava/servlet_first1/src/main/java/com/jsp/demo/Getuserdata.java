package com.jsp.demo;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
@WebServlet("/getdata")
public class Getuserdata extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		 
		String username=req.getParameter("name");
		String password=req.getParameter("pass");
		int id=Integer.parseInt(req.getParameter("id"));
		
		res.getWriter().println("id : "+id);
		
		res.getWriter().println("username : "+username);
		res.getWriter().println("password : "+password);
		
	}

}
