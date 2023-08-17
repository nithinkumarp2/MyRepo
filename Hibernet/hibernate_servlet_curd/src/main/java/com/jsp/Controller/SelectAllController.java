package com.jsp.Controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.dao.EmployeeDao;
import com.jsp.dto.EmployeeEntity;
import com.jsp.service.EmployeeService;

@WebServlet("/Display")
public class SelectAllController extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		EmployeeService service = new EmployeeService();

		List<EmployeeEntity> list = service.SelectAll();
		if (list.size() > 0) {
			req.setAttribute("data", list);
			RequestDispatcher dispatcher = req.getRequestDispatcher("Display.jsp");
			dispatcher.forward(req, resp);
		}

	}
}
