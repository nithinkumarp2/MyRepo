package com.jsp.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.web.dao.employeeDao;
import com.jsp.web.model.employee;

/**
 * Servlet implementation class getemployeecontroler
 */
public class getemployeecontroler extends HttpServlet {
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
		
		int id=Integer.parseInt(request.getParameter("id"));
		
		employeeDao dao=new employeeDao();
		
		employee e1=dao.getemployee(id);
		
		
		request.setAttribute("nitin", e1);
		
		
		
		RequestDispatcher rd=request.getRequestDispatcher("showemployee.jsp");
		rd.forward(request, response);
		
		
	}

	 

}
