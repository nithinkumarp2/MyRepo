package com.jdbc.model;

public class Employee {

	private int employee_id;
	private String employee_name;
	private String employee_address;
	private double employee_salary;
	
	
	
	
	public Employee(int employee_id, String employee_name, String employee_address, double employee_salary) {
		super();
		this.employee_id = employee_id;
		this.employee_name = employee_name;
		this.employee_address = employee_address;
		this.employee_salary = employee_salary;
	}
	
	
	 

	

	public Employee(String employee_name, String employee_address, double employee_salary) {
		super();
		this.employee_name = employee_name;
		this.employee_address = employee_address;
		this.employee_salary = employee_salary;
	}






	public int getEmployee_id() {
		return employee_id;
	}
	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}
	public String getEmployee_name() {
		return employee_name;
	}
	public void setEmployee_name(String employee_name) {
		this.employee_name = employee_name;
	}
	
	public String getEmployee_address() {
		return employee_address;
	}
	public void setEmployee_address(String employee_address) {
		this.employee_address = employee_address;
	}
	public double getEmployee_salary() {
		return employee_salary;
	}
	public void setEmployee_salary(double employee_salary) {
		this.employee_salary = employee_salary;
	}
}
