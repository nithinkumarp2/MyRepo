package com.jdbc.main;

import java.sql.SQLException;
import java.util.Scanner;

import com.jdbc.model.Employee;
import com.jdbc.service.Databaseservice;

public class mainClass {

	private static Employee employee;

	public static void main(String[] args) {
		try {
		Scanner sc=new Scanner(System.in);
		Databaseservice databaseservice=new Databaseservice();
		boolean result=true;
		while (true) {
			
		 System.out.println("Enter choice");
		 System.out.println("1.instert"); 
		 System.out.println("2.select_All");
		 System.out.println("3.select_by-id");
		 System.out.println("4.update");
		 System.out.println("5.delete");
		 System.out.println("6.Exite");
		 int choice=sc.nextInt();
		 
		 switch (choice) {
			 case 1:
				 System.out.println("Enter id , name , address , salary");
				
				 databaseservice.insertemployee(new Employee(sc.nextInt(),sc.next(),sc.next(),sc.nextDouble()));
				 break;
				 
			 case 2:

                  databaseservice.selectallemployee();
				 break;
			 case 3:
				 System.out.println("enter id");
				databaseservice.select_by_id(sc.nextInt());
				 break;
				 
			 case 4:
				 System.out.println("enter id");
				 int updated_id =sc.nextInt();
					databaseservice.select_by_id(updated_id);
					System.out.println("enter new   name , address , salary");
					//String new_name=sc.next();
					databaseservice.updateemployee(new Employee(updated_id,sc.next(),sc.next(),sc.nextDouble()) );
				// System.out.println("updated");
				 break;
			 case 5:
				 System.out.println("enter id");
				 databaseservice.deleteemployee(sc.nextInt());
				 System.out.println("deleted");
				 break;
			 case 6:
				 System.out.println("Exite successfully");
				 result=false;
				 break;
				 default :
					 System.out.println("incorrect choice");
					 break;
		}
		 
		}
		}
		catch(SQLException e) {
			System.out.println("something went wrong "+e);
		}
		 
	}

}
