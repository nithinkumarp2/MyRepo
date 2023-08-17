package com.jsp.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jsp.Dto.user;
import com.jsp.service.userservice;
import com.jsp.util.myconfig;

@WebServlet("/update")
public class updatecontroller extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 int id=Integer.parseInt(req.getParameter("id"));
		 String name=req.getParameter("name");
		 int age=Integer.parseInt(req.getParameter("age"));
		 
		 ApplicationContext app=new AnnotationConfigApplicationContext(myconfig.class);
		 user user=( user) app.getBean("user");
		 user.setId(id);
		 user.setName(name);
		 user.setAge(age);
		 
		 userservice service=(userservice) app.getBean("userservice");
		 user user1=service.update(user);
		 
		 if (user1!=null) {
			RequestDispatcher dispatcher=req.getRequestDispatcher("index.jsp");
			dispatcher.forward(req, resp);
		}
		 else
		 {
			 RequestDispatcher dispatcher=req.getRequestDispatcher("update.jsp");
				dispatcher.include(req, resp);
			 
		 }
	}
}
