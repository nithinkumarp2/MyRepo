package com.jdbc.util;

public class Queryutil {

	public static String insertemployeeQuery()
	{
		return "INSERT INTO EMPLOYEE(EMPLOYEE_ID,EMPLOYEE_NAME,EMPLOYEE_ADDRESS,EMPLOYEE_SALARY) VALUES(?,?,?,?)";
	}//end of insert
	
	public static String selectallemployee()
	{
		return "select * from employee";
	}// end of select all
	
	public static String select_by_id(int  id)
	{
		return "select * from employee where employee_id = "+id;
		
	}// end of select by id
	
	public static String update(int employee_id)
	{
		return "update employee set   employee_name = ? , employee_address = ? , employee_salary = ? where employee_id = "+employee_id;
	}
	
	
	public static String delete_employee(int id)
	{
		return "delete from employee  where employee_id = "+ id;
	}//end of delete

	
}
