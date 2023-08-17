package com.jsp.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

  
public class select_perticular {

	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_first","root","root");
			Statement statement=connection.createStatement();
			 ResultSet rs=statement.executeQuery("select * from employee where id=123");
			 
		         while(rs.next())
		         {
		        	 System.out.println("id="+rs.getInt(1)+" name="+rs.getString(2)+" age="+rs.getInt(3)+" phone="+rs.getLong(4));
		         }
		         connection.close();
		} catch (ClassNotFoundException  | SQLException e) {
			 
			e.printStackTrace();
		}
		
	}
}
