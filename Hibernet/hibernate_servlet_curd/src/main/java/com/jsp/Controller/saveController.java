package com.jsp.Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.dto.EmployeeEntity;
import com.jsp.service.EmployeeService;
@WebServlet("/save")
public class saveController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 int id=Integer.parseInt(req.getParameter("id"));
		 String name=req.getParameter("name");
		 int age=Integer.parseInt(req.getParameter("age"));
		 
		 EmployeeEntity employee=new EmployeeEntity();
		 EmployeeService service=new EmployeeService();
		 if (employee!=null) {
			
		 employee.setId(id);
		 employee.setName(name);
		 employee.setAge(age);
		 service.save(employee);
		 RequestDispatcher dispatcher=req.getRequestDispatcher("index.jsp");
		 dispatcher.forward(req, resp);
	}
		 else
		 {
			 RequestDispatcher dispatcher=req.getRequestDispatcher("save.jsp");
			 dispatcher.include(req, resp);
		 }
	}
}
