package com.jsp.demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.Scanner;

public class delete_preparedstatement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        
		 try {
			 
			 Properties properties=new Properties();
			 FileInputStream fileInputStream=new FileInputStream("dbconfig.properties");
			 properties.load(fileInputStream);
			 
			 
			 Class.forName("com.mysql.cj.jdbc.Driver");
				Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_last ",properties);
				
				PreparedStatement preparedStatement=connection.prepareStatement("delete from name_phone where name=?");
				System.out.println("enter name to delete:");
				String name=sc.next();
				preparedStatement.setString(1, name);
				int rows=preparedStatement.executeUpdate();
				if (rows>0) {
					System.out.println(rows+" rows deleted successfully");
				} else {
					System.out.println("entered wrong input");

				}
			connection.close();
		} catch (SQLException e) {
			 
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
