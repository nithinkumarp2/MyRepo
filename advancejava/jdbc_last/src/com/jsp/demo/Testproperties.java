package com.jsp.demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;



public class Testproperties {

	public static void main(String[] args) {
		 
		try {
			Properties properties=new Properties();
			FileInputStream fileInputStream= new FileInputStream("dbconfig.properties");
			properties.load(fileInputStream);
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_last",properties);
			
			Statement statement=connection.createStatement();
			  ResultSet rs= statement.executeQuery("create table freinds(name varchar(20),phone bigint(10))");
			
			connection.close();
			System.out.println("created table");
		} catch (ClassNotFoundException | SQLException | IOException e) {
			 
			e.printStackTrace();
		}
	}

}
