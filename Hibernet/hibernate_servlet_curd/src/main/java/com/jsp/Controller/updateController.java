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

@WebServlet("/update")
public class updateController extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		int id = Integer.parseInt(req.getParameter("id"));
		String name = req.getParameter("name");
		int age = Integer.parseInt(req.getParameter("age"));

		EmployeeEntity employee = new EmployeeEntity();
		EmployeeService service = new EmployeeService();
		employee.setId(id);
		employee.setName(name);
		employee.setAge(age);
		service.update(employee);
//	employee=dao.em.find(EmployeeEntity.class, employee.getId());

		if (employee != null) {

			RequestDispatcher dispatcher = req.getRequestDispatcher("Display.jsp");
			dispatcher.forward(req, resp);
		} else {
			RequestDispatcher dispatcher = req.getRequestDispatcher("update.jsp");
			dispatcher.include(req, resp);
		}

	}
}
