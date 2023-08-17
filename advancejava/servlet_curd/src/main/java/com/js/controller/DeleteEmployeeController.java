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

@WebServlet("/Delete")
public class DeleteEmployeeController extends HttpServlet {
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		int id = Integer.parseInt(req.getParameter(("id")));

		EmployeeDto employee = new EmployeeDto();
		EmployeeService service = new EmployeeService();
//		employee.setId(id);

		if (employee != null) {
			service.DeleteEmployee(id);
//	RequestDispatcher dispatcher=req.getRequestDispatcher("DisplayAll.jsp");
//	dispatcher.forward(req, resp);
		} else {
//		RequestDispatcher dispatcher=req.getRequestDispatcher("Delete.jsp");
//		dispatcher.include(req, resp);
		}

	}
}
