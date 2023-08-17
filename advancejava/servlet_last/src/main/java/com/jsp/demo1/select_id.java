package com.jsp.demo1;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/select_id")
public class select_id extends HttpServlet {

	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		String Name=req.getParameter("name");
		
		res.getWriter().println("selected name is "+Name);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/servlet_first","root","root");
		//	Statement statement=connection.createStatement();
			PreparedStatement statement=connection.prepareStatement("select * from login where name= ?");
			statement.setString(1, Name);
 			ResultSet rs=statement.executeQuery();
			if (rs.next()) {
				res.getWriter().println("------------------------------------------------------");
				res.getWriter().println("NAME "+rs.getString(1)+"  PASSWORD "+rs.getString(2));
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			res.getWriter().println(e);
		}
	}
}
