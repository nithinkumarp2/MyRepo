package com.jsp.Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.dao.EmployeeDao;
import com.jsp.dto.EmployeeEntity;
import com.jsp.service.EmployeeService;
@WebServlet("/Delete")
public class DeleteController extends HttpServlet{
@Override
public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	int id=Integer.parseInt(req.getParameter("id"));
	EmployeeEntity employee=new EmployeeEntity();
	EmployeeService service=new EmployeeService();
	employee.setId(id);
	
 
	if (employee!=null) {
		service.Delete(employee);
		RequestDispatcher dispatcher=req.getRequestDispatcher("");
		dispatcher.forward(req, resp);
	}
	else {
		RequestDispatcher dispatcher=req.getRequestDispatcher("Delete.jsp");
		dispatcher.include(req, resp);
	}
}
}
