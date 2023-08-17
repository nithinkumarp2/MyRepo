package com.jsp.demo;

 

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/test2")
public class servlettest2 extends HttpServlet {

	public void service( HttpServletRequest req , HttpServletResponse res) throws ServletException, IOException {
		
		res.getWriter().println("hello");
	}
}
