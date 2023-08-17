package com.js.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.Dto.EmployeeDto;
import com.jsp.service.EmployeeService;
@WebServlet("/saveDetails")
public class SaveDetailsController extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id=Integer.parseInt(req.getParameter("id"));
		String FirstName=req.getParameter("first");
		String LastName=req.getParameter("last");
		int age=Integer.parseInt(req.getParameter("age"));
		String email=req.getParameter("email");
		String password=req.getParameter("pass");
		
		EmployeeDto employeeDto=new EmployeeDto();
		
		if (employeeDto !=null) {
				
		
		employeeDto.setId(id);
		employeeDto.setFirstName(FirstName);
		employeeDto.setLastName(LastName);
		employeeDto.setAge(age);
		employeeDto.setEmail(email);
		employeeDto.setPassword(password);
		EmployeeService service=new EmployeeService();
		service.SaveDetails(employeeDto);
		
			RequestDispatcher dispatcher=req.getRequestDispatcher("index.jsp");
			dispatcher.forward(req, resp);
		}
		else {
			
			RequestDispatcher dispatcher=req.getRequestDispatcher("saveDetail.jsp");
			dispatcher.include(req, resp);
		}
	}
}
