package com.jsp.demo1;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class select  extends HttpServlet {

	public void service(HttpServletRequest req , HttpServletResponse res) throws IOException {
		
//		String name=req.getParameter("name");
		
//		res.getWriter().println(name);
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/servlet_first","root","root");
			 Statement  Statement=connection. createStatement();
			 ResultSet rs=Statement.executeQuery("select * from login ");
			 
			 while (rs.next()) {
				res.getWriter().println("NAME : "+ rs.getString(1)+"       PASSWORD : "+rs.getString(2));
			}
			 
			 
		} catch (ClassNotFoundException | SQLException e) {
			res.getWriter().println(e);
		}
		
		
	}
}
