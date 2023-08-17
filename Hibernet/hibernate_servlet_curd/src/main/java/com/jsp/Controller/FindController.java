package com.jsp.Controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.dao.EmployeeDao;
import com.jsp.dto.EmployeeEntity;
import com.jsp.service.EmployeeService;

 
@WebServlet("/find")
public class FindController extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 int id=Integer.parseInt(req.getParameter("id"));
		 
		 EmployeeEntity employee=new EmployeeEntity();
		 EmployeeService service=new EmployeeService();
		  
		 employee= service.Find(id);
		 if (employee!=null) {
			
RequestDispatcher dispatcher=req.getRequestDispatcher("Display.jsp");
dispatcher.forward(req, resp);
		}
		 else
		 {
			 RequestDispatcher dispatcher=req.getRequestDispatcher("find.jsp");
			 dispatcher.include(req, resp);
		 }
	}
}

////
//EmployeeEntity e=new EmployeeEntity();
//PersonService ps=new PersonService();
//e=ps.Find(6);
//
//if (e != null) {
//	System.out.println("USER ID : "+e.getId());
//	System.out.println("USER NAME : "+e.getName());
//	System.out.println("USER AGE : "+e.getAge());