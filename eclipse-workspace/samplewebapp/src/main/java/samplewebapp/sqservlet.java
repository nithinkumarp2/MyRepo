package samplewebapp;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class sqservlet extends HttpServlet {

	
	public void service(HttpServletRequest req , HttpServletResponse res) throws IOException
	{
		
		int k=(int) req.getAttribute("s");
		int v=(int) req.getAttribute("c");
		res.getWriter().println("square of the given input is :  "+k);
		res.getWriter().println("Addition of two numbers is : "+v);
	}
}
