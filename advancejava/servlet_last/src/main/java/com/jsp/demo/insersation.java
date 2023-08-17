package com.jsp.demo;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class insersation extends HttpServlet{

	
	public void service(HttpServletRequest req , HttpServletResponse res) throws IOException
	{
	   String name=req.getParameter("name");
	   String pass=req.getParameter("pass");
	   
	   res.getWriter().println(name);
	   res.getWriter().println(pass);
	   
	   
	   try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/servlet_first","root","root");
		PreparedStatement preparedStatement=connection.prepareStatement("insert into login values(?,?)");
		preparedStatement.setString(1, name);
		preparedStatement.setString(2, pass);
		int rows=preparedStatement.executeUpdate();
		
		if (rows>0) {
			
			res.getWriter().println("inserted successfully");
		}
		else
		{
			res.getWriter().println("insertation failed ");
		}
		
		
		
		
	} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		res.getWriter().println(e);
	}
	}
}
