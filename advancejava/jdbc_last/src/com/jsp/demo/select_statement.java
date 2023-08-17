package com.jsp.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class select_statement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        
		 try {
			 Class.forName("com.mysql.cj.jdbc.Driver");
				Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_last?user=root&password=root");
				 
			 Statement  Statement= connection. createStatement();
		//	 Statement.executeQuery("select * from name_phone ");
			 ResultSet rs= Statement.executeQuery("select * from name_phone ");
			
			 while (rs.next()) {
				System.out.println( rs.getString(1)+rs.getLong(2));
			}
			connection.close();
		} catch (SQLException e) {
			 
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	}

 
