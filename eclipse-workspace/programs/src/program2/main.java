package program2;

import Hospital_details.Employees;
import Hospital_details.Hospital;
import Hospital_details.hDepartments;
import programs1.*;
public class main extends protecte {
	 
	public static void main(String[] args) 
	{
		//System.out.println(protecte.str);
//		protecte.m1();
		
		System.out.println(A.a);
		A.m1();
		new A(0, str);
		 
		System.out.println("------------protecte is using in diferrent package---");
		protecte.m1();
		System.out.println(protecte.str);
		 System.out.println("constructor will not print in the different package by using protected keyword");
		 
//		  employee e1=new employee("nithin",123,500000.0,123456789l);
//		 
//		  e1.setname("kumar");
//		System.out.println(e1.getname()); 
//		 e1.displauAll();
		 A.m1();
//		 student s=new student();//new student("nithin",143,9640369880l);
//		 s.getsname();
//		 s.setname("kumar");in	
//           s.getsname();
		 
		 bank b=new bank("andhra bank","AND10001","bhagyanagar");
		System.out.println( b.getAddress());
		b.displayall();
		b.setBname("KOTAK BANK");
		b.displayall();
		
		
		System.err.println("---hospital details-------");
		Hospital h=new Hospital();
		hDepartments d=new hDepartments();
		Employees e=new Employees();
		h.hspt("YASHODHA", "MALAKPET");
		d.dDetails("BRAIN specialist", 1234);
		e.employee("raja",143,700000, "karmanghat");
          h.displayhosp();
          System.err.println("DETAILS OF THE DEPARTMENT");
          d.displaydept();
          System.err.println("DETAILS OF THE EMPLOYEE");
          e.displayemp();
	}
	}


