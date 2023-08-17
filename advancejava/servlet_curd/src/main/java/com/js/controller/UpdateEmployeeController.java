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

@WebServlet("/update")
public class UpdateEmployeeController extends HttpServlet {
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		int id = Integer.parseInt(req.getParameter("id"));
		String FirstName = req.getParameter("first");
		String LastName = req.getParameter("last");
		int age = Integer.parseInt(req.getParameter("age"));
		String email = req.getParameter("email");
		String password = req.getParameter("pass");

		EmployeeDto employee = new EmployeeDto();
		EmployeeService service=new EmployeeService();
		employee.setId(id);
		employee.setFirstName(FirstName);
		employee.setLastName(LastName);
		employee.setAge(age);
		employee.setEmail(email);
		employee.setPassword(password);
		
		if (employee != null) {

			service.UpdateEmployee(employee);
			
		
			 
			RequestDispatcher dispatcher=req.getRequestDispatcher("DispalyEmployee.jsp");
			dispatcher.forward(req, resp);
		}
		else
		{
			RequestDispatcher dispatcher=req.getRequestDispatcher("update.jsp");
			dispatcher.include(req, resp);
		}

	}
}
