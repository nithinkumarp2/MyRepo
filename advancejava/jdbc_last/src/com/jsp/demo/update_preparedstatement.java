package com.jsp.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class update_preparedstatement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        
		 try {
			 Class.forName("com.mysql.cj.jdbc.Driver");
				Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_last?user=root&password=root");
				
				PreparedStatement preparedStatement=connection.prepareStatement("update name_phone set name=?,phone=? where name=?");
				System.out.println("enter new name:");
				String newname=sc.next();
				
				System.out.println("enter new phone number");
				 long newphone=sc.nextLong();
				
				System.out.println("enter name:");
				String name=sc.next();
				
				preparedStatement.setString(1, newname);
				preparedStatement.setLong(2, newphone);
				preparedStatement.setString(3, name);
				
				int rows=preparedStatement.executeUpdate();
				
				if (rows>0) {
					System.out.println(rows+" rows updated successfully");
				} else {
					System.out.println("entered wrong input");

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
