package programs1;

import java.util.Iterator;

import program2.main;

interface details
{
	public void schooldetails();
	public void teacherdetails();
	public void studentdetails();
}
class school implements details
{
         String schName;
         String schAddress;
         String Schcode;

	public void schooldetails(String name,String sddress,String code) {
		  this.schName=name;
		  this.schAddress=sddress;
		 
		  this.Schcode=code;
		
		  
	}
	
   public void displayschdetails()
   {
	   System.err.print("SCHOOL NAME IS ");
	   System.out.println(schName);
	   System.err.print("SCHOOL ADDRESS IS ");
	   System.out.println(schAddress);
	   System.err.print("SCHOOL CODE IS ");
	   System.out.println(Schcode);
   }
	 
	String tecName;
	String subject;
	long phno;
	public void teacherdetails(String name,String sub,long phno ) {
		this.tecName=name;
		this.subject=sub;
		this.phno=phno;
		
	}
	public void displaytech()
	{
		System.err.print("TEACHER NAME IS ");
		System.out.println(tecName);
		System.err.print("SUBJECT IS ");
		System.out.println(subject);
		System.err.print("TEACHER PHONE NUMBER IS ");
		System.out.println(phno);
	}

	String sName;
	String sDoB;
	int sclass;
	String sAddress;
	long sParentphno;
	public void studentdetails(String name,String dob,int sclass, String address,long phno) {
		this.sName=name;
		this.sDoB=dob;
		this.sclass=sclass;
		this.sAddress=address;
		this.sParentphno=phno;
		
	}
	public void displaystd()
	{
		System.err.print("STUDENT NAME IS ");
		System.out.println(sName);
		System.err.print("STUDENT DOB IS ");
		System.out.println(sDoB);
		System.err.print("STUDENT CLASS IS ");
		System.out.println(sclass);
		System.err.print("STUDENT ADDRESS IS ");
		System.out.println(sAddress);
		System.err.print("STUDENT PARENT PHNO IS ");
		System.out.println(sParentphno);
	}

	@Override
	public void schooldetails() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void teacherdetails() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void studentdetails() {
		// TODO Auto-generated method stub
		
	}

	 
}
   
class ob
{
	public static void m() {
		 
        Object[] o= {1,2.0,'A',"kumar"};
        int n=o.length;
        for(int i=0;i<n;i++)
        {
        	System.out.println("       "+ "  ");
       	 System.out.println(o[i]);
        }
	}
}

public class abstration {

	public static void main(String[] args) {
		 school s=new school();
		 System.err.println("---DETAILS OF SCHOOL--------");
		  
		 
		 s.schooldetails("LITTLE ROSES HIGHT SCHOOL", "greenpark colony", "LRHS");
             s.displayschdetails();
             
             System.err.println("--------DETAILS OF TEACHER---------");
             s.teacherdetails("SUDHA", "maths", 99999999999l);
             s.displaytech();
             
             System.err.println("----------DETAILS OF STUDENT-----------");
             s.studentdetails("pradeep", "22-10-1999 ", 5, "karmanghat", 777777777l);
             s.displaystd();
             ob.m();
            
	}

}
