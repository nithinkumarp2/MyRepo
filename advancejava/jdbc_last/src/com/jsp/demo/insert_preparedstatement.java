package com.jsp.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
//import com.jsp.demo.*;
import java.util.Scanner;


public class insert_preparedstatement {
	 

	 
	public static void main(String[] args) {
		
 Scanner sc=new Scanner(System.in);
        
		 try {
			 Class.forName("com.mysql.cj.jdbc.Driver");
				Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_last?user=root&password=root");
				 
			PreparedStatement preparedStatement= connection.prepareStatement("insert into name_phone(name,phone) values(?,?)");
			System.out.println("enter name :");
			String name=sc.nextLine();
			System.out.println("enter phone no:");
			long phone=Long.parseLong(sc.nextLine());
			preparedStatement.setString(1, name);
			preparedStatement.setLong(2, phone);
			int rows =preparedStatement.executeUpdate();
			
			if (rows>0) {
				System.out.println(rows+" rows inserted successfully");
			} else {
                   System.err.println("insertation failed due to in correct input");
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
