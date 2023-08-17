package com.login;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.login.dao.logindao;
@WebServlet("/login")
public class Login extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 String name=req.getParameter("name");
		 String password=req.getParameter("pass");
		 
		 logindao dao=new logindao();
		 
		 if (dao.check(name, password)) {
			 HttpSession session=req.getSession();
			 session.setAttribute("username", name);
//			RequestDispatcher dispatcher=req.getRequestDispatcher("welcome.jsp");
//			dispatcher.forward(req, resp);
			 resp.sendRedirect("welcome.jsp");
		}
		 else {
//			 RequestDispatcher dispatcher=req.getRequestDispatcher("login.jsp");
//				dispatcher.include(req, resp);
			 resp.sendRedirect("login.jsp");
		}
	}
}
