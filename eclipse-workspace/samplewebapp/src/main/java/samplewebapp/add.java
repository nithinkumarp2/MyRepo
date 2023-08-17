package samplewebapp;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

  
public class add extends HttpServlet {

	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException
	{
		int a=Integer.parseInt(req.getParameter("num1"));
		int b=Integer.parseInt(req.getParameter("num2"));
		
		int c=a+b;
		
		int k=c*c;
		
		req.setAttribute("s", k);
		req.setAttribute("c", c);
	 	
		RequestDispatcher request=req.getRequestDispatcher("sq");
		request.forward(req, res);
	}
}
