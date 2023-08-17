package com.jsp.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class expreparedstatement {

	public static void main(String[] args) {
		 try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_first","root","root" );
			PreparedStatement  preparedStatement=connection. prepareStatement("insert into employee values(?,?,?,?)");
			preparedStatement.setInt(1, 1);
			preparedStatement.setString(2, "nnnn");
			preparedStatement.setInt(3,22);
			preparedStatement.setLong(4,99665442);
			preparedStatement.executeUpdate();
			connection  .close();
			System.out.println("data inserted successfully");
		} catch (ClassNotFoundException e) {


			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
