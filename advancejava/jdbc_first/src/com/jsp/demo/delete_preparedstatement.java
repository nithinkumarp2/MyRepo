package com.jsp.demo;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

public class delete_preparedstatement {

	public static void main(String[] args) {
		 try {
			 
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_first","root","root");
			PreparedStatement preparedStatement=connection.prepareStatement("delete from employee where id= ? ");
			preparedStatement.setInt(1, 1);
			preparedStatement.executeUpdate();
			connection.close();
			System.out.println("deleted successfully");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
