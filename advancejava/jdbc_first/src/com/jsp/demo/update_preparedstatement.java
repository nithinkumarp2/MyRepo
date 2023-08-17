package com.jsp.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class update_preparedstatement {

	public static void main(String[] args) {
		 try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_first","root","root");
			PreparedStatement preparedStatement=connection.prepareStatement("update employee set id=? where id = ?");
			preparedStatement.setInt(1, 12);//updaeted value
			preparedStatement.setInt(2, 1256789);
			int rows=preparedStatement.executeUpdate(   );
			connection.close();
			if (rows>0) {
				System.out.println(rows+" upadeted successfully");	
			} else {
               System.out.println("pls check your id");
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
