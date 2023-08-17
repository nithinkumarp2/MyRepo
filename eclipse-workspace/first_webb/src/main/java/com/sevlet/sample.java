package com.sevlet;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class sample extends HttpServlet{

	
	public void service(HttpServletRequest req , HttpServletResponse res) throws IOException
	{
		String name=req.getParameter("num");
		
		res.getWriter().println("YOU ARE ENTER NAME IS : "+ name);
	}
}
