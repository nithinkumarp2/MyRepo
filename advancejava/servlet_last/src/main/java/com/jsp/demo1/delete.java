package com.jsp.demo1;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class delete extends HttpServlet{

	public void service(HttpServletRequest req , HttpServletResponse res) throws IOException {
		
		String pass=req.getParameter("pass");
		
		res.getWriter().println("deleted data is : "+pass);
		
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/servlet_first","root","root");
			PreparedStatement preparedStatement=connection.prepareStatement("delete from login where password=?");
			preparedStatement.setString(1, pass);
			int rows=preparedStatement.executeUpdate();
			
			if (rows>0) {
				res.getWriter().println("DELETED SUCCESSFULLY ");
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			res.getWriter().println(e);
		}
	}
}
