package com.jsp.demo1;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class update extends HttpServlet{

	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		String user=req.getParameter("uname");
		String pass=req.getParameter("upass");
		String oldname=req.getParameter("oldname");
		
		
		res.getWriter().println("updated name is "+user);
		res.getWriter().println("updated password is "+pass);
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/servlet_first","root","root");
			PreparedStatement preparedStatement=connection.prepareStatement("update login set name=?,password=? where name=?");
			preparedStatement.setString(1, user);
			preparedStatement.setString(2, pass);
			preparedStatement.setString(3, oldname);
			int rows=preparedStatement.executeUpdate();
			if (rows>0) {
				res.getWriter().println("UPDATED SUCCESSFULLY");
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}
