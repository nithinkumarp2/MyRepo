package com.jsp.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class connection {

	//public static void main(String[] args) {
	public static Connection  connection() throws Exception {
		  try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			 
		} catch (ClassNotFoundException e) {
			 
			e.printStackTrace();
		 
		
	}
		  return DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_last?user=root&password=root");
	}
}

	 

	 

 
