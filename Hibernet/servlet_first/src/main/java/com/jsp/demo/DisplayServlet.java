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
@WebServlet("/displayservlet")
public class DisplayServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
 
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("nithin");
		EntityManager em=emf.createEntityManager();
		
		Query q=em.createQuery("select u from user u");
		List<user> list=q.getResultList();

		if (list.size()>0) {
			req.setAttribute("users", list);
  			RequestDispatcher   dispatcher=req.getRequestDispatcher("home.jsp");
			dispatcher.forward(req, resp);
  		}
		else {
			RequestDispatcher   dispatcher=req.getRequestDispatcher("index.jsp");
			dispatcher.include(req, resp);
		}
			
		
		
 	}
}
