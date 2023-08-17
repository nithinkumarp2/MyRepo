package com.jsp.demo;

 

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class servlet  extends HttpServlet{

	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		
 		persondetails pp=new persondetails();
//		ps.setPassword("username");
//		ps.setPassword("password");
//		EntityManagerFactory emf = Persistence.createEntityManagerFactory("nithin");
//		EntityManager em=emf.createEntityManager();
//		EntityTransaction et=em.getTransaction();
//		
//		et.begin();
//		em.persist(ps);
//		et.commit();
//		
		
		//JDBC STEPS
		String username=  req.getParameter("name");
		String password=req.getParameter("pass");
		pp.setUsername(username);
		pp.setPassword(password);
		res.getWriter().println(pp.getUsername());
		res.getWriter().println(password);
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/hibernate_web","root","root");
			PreparedStatement ps=connection.prepareStatement("insert into persondetails values(?,?)");
			ps.setString(1, username);
			ps.setString(2, password);
			int rows= ps.executeUpdate();
			if (rows>0) {
				res.getWriter().println("data entered successfully");
			}
		} catch (ClassNotFoundException e) {
			 
			res.getWriter().println(e);
		} catch (SQLException e) {
 
			res.getWriter().println(e);
		}
		
		
	}
	
	 

}
