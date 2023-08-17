package com.jsp.demo;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/userinfo")
public class same_user extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		 
		//res.setContentType("text/html");
		int id=Integer.parseInt(req.getParameter("id"));
		String name=req.getParameter("name");
		int age=Integer.parseInt(req.getParameter("age"));
		
		PrintWriter printWriter=res.getWriter();
		
		printWriter.println("ID : "+id);
		printWriter.println("NAME : "+name);
		printWriter.println("AGE : "+age);
		
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/servlet_first","root","root");
			PreparedStatement preparedStatement=connection.prepareStatement("insert into userinfo values(?,?,?)");
			 preparedStatement.setInt(1, id);
			 preparedStatement.setString(2, name);
			 preparedStatement.setInt(3, age);
			 
			 int rows=preparedStatement.executeUpdate();
			 
			 if (rows>0) {
				res.getWriter().println(rows+"  row inserted successfully");
				res.getBufferSize();
			}
			 else {
				 res.getWriter().println("insertation failed");
			 }
		} catch (ClassNotFoundException | SQLException e) {
			res.getWriter().println(e);
		}
	}

}
