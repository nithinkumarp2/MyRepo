package com.jsp.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class executequery {

	public static void main(String[] args) {
		 
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_last","root","root");
			Statement statement=connection.createStatement();
			ResultSet rs=statement.executeQuery("select * from freinds");
			
			while(rs.next()) {
				System.out.println("name ="+rs.getString(1)+" phone ="+rs.getLong(2));
				System.err.println("+------------------------");
			}
			
			connection.close();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
