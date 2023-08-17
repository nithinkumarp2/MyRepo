package com.js.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.Dao.EmployeeDao;
import com.jsp.Dto.EmployeeDto;
import com.jsp.service.EmployeeService;

@WebServlet("/getall")
public class GetAllDetailsController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		EmployeeDao d=new EmployeeDao();
		EmployeeService service=new EmployeeService();
		
		if (d.list.size() > 0) {
			service.GetAllDetails();
			req.setAttribute("details", d.list);
			RequestDispatcher dispatcher=req.getRequestDispatcher("display.jsp");
			dispatcher.forward(req, resp);
		}
	}
}
