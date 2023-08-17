package com.nithin;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

 
  public class namen extends HttpServlet {

	
	 
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		
		
		String name=req.getParameter("n");
		res.getWriter().println("you are entered name is "+name);
	}
}
