package com.jdbc.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.jdbc.model.Employee;
import com.jdbc.util.Databaseutil;
import com.jdbc.util.Queryutil;

public class Databaseservice {

	Databaseutil databaseutil =new Databaseutil();
	
	
	public void insertemployee(Employee employee) throws SQLException {
		
		Connection connection=databaseutil.getConnection();
		PreparedStatement  preparedStatement=connection.prepareStatement(Queryutil.insertemployeeQuery());
		preparedStatement.setInt(1, employee.getEmployee_id());
		preparedStatement.setString(2, employee.getEmployee_name());
		preparedStatement.setString(3, employee.getEmployee_address());
		preparedStatement.setDouble(4,employee.getEmployee_salary());
		int rows=preparedStatement.executeUpdate();
		if (rows>0) {
			System.out.println(rows+" row inserted successfully ");
		} else {
 
			System.out.println("insertation faiiled");
		}
		
	}//end 

	
	public void selectallemployee() throws SQLException
	{
		Connection connection=databaseutil.getConnection();
		Statement statement=connection.createStatement();
		ResultSet resultSet=statement.executeQuery(Queryutil.selectallemployee());
		while (resultSet.next()) {
		displayemployee(new Employee( resultSet.getInt(1),
			resultSet.getString(2),
			resultSet.getString(3),
			resultSet.getDouble(4)));
		System.out.println("------------------------------------------------");
		
		}
	}//end of selectallemployee
	
	public static void displayemployee(Employee employee)
	{
		System.out.println("employee id : "+employee.getEmployee_id());
		System.out.println("employee name : "+employee.getEmployee_name());
		System.out.println("employee address : "+employee.getEmployee_address());
		System.out.println("employee salary : "+employee.getEmployee_salary());
		
	}
	
	public void select_by_id(int id) throws SQLException
	{
		Connection connection =databaseutil.getConnection();
		Statement statement=connection.createStatement();
		ResultSet resultSet = statement.executeQuery(Queryutil.select_by_id(id));
		if (resultSet.next()) {
			displayemployee(new Employee( resultSet.getInt(1),
					resultSet.getString(2),
					resultSet.getString(3),
					resultSet.getDouble(4)));
				System.out.println("------------------------------------------------");
				
		} else {
                     System.out.println("invalid id ");
		}
	}//end of select by id
	
	
	public void updateemployee(Employee employee)  throws SQLException
	{
		 
		Connection connection=databaseutil.getConnection();
		PreparedStatement preparedStatement=connection.prepareStatement(Queryutil.update(employee.getEmployee_id()));
//		 preparedStatement.setInt(1, employee.getEmployee_id());
		 preparedStatement.setString(1, employee.getEmployee_name());
		 preparedStatement.setString(2, employee.getEmployee_address());
		 preparedStatement.setDouble(3, employee.getEmployee_salary());
		 int row= preparedStatement.executeUpdate();
		 if (row>0) {
			System.out.println("updated successfully");
		} else {
            System.out.println("not updated");
		}
		 
	}//end of update
	
 


	public   void deleteemployee(int id ) throws SQLException
	{
		 Connection connection=databaseutil.getConnection();
		 PreparedStatement preparedStatement=connection.prepareStatement(Queryutil.delete_employee(id));
		 
		 int rows=preparedStatement.executeUpdate();
		 if (rows>0) {
			System.out.println("deleted successfully");
		} else {
              System.out.println("not deleted");
		}
	}
}
