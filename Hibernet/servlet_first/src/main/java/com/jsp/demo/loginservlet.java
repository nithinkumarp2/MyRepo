package com.jsp.demo;

import java.io.IOException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/loginservlet")
public class loginservlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String email = req.getParameter("email");
		String password = req.getParameter("pass");

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("nithin");
		EntityManager em = emf.createEntityManager();

		Query q = em.createQuery("select u from user u where email=?1 and password=?2");
		q.setParameter(1, email);
		q.setParameter(2, password);

 		List<user> list = q.getResultList();

		if (list.size() > 0) {
 
//			req.setAttribute("email", email);
//			req.setAttribute("password", password);
			
			RequestDispatcher dispatcher = req.getRequestDispatcher("home.html");
			dispatcher.forward(req, resp);
		} else {
			RequestDispatcher dispatcher = req.getRequestDispatcher("login.html");
			dispatcher.include(req, resp);
		}

	}

}
