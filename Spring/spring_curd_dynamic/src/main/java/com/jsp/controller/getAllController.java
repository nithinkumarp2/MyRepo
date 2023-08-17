package com.jsp.controller;

import java.io.IOException;
import java.util.List;

import javax.persistence.Query;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jsp.Dao.UserDao;
import com.jsp.Dto.user;
import com.jsp.service.userservice;
import com.jsp.util.myconfig;

@WebServlet("/getall")
public class getAllController extends HttpServlet {
	@Autowired
	UserDao dao;

//	@Autowired
//	List<user> list;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ApplicationContext app = new AnnotationConfigApplicationContext(myconfig.class);
		user user = (user) app.getBean("user");

		userservice service = (userservice) app.getBean("userservice");
		List<user>  list = service.getAll(user);

		if (list.size() > 0) {

			req.setAttribute("add", list);
			RequestDispatcher dispatcher = req.getRequestDispatcher("index.jsp");
			dispatcher.forward(req, resp);
		}
	}

}
