package programs1;

class Department
{
	int deptId;
	String deptName;
	public Department(int id,String name) {
		this.deptId=id;
		this.deptName=name;
	}
	void displaydept()
	{
		System.out.println("department id is "+deptId);
		System.out.println("department name is "+deptName);
	}
}

class university
{
	String uniName;
	int noofemployees;
	public university(String name,int employee)
	{
		this.uniName=name;
		this.noofemployees=employee;
	}
	void displayuni()
	{
		System.out.println("university name is "+uniName);
		System.err.println("university no of employees is "+noofemployees); 
	}
}
 
class students
{
	String sname;
	int sid;
	Department d1=new Department(101, "CSE");
	
	students(String name,int id)
	{
		this.sname=name;
		this.sid=id;
		
	}
	static university u1=new university("JNTU", 10);
	void display()
	{
		System.err.println("student name is "+sname);
		System.err.println("student id is "+sid);
		 
	}
}

public class Example {
public static void main(String[] args) {
	students s1=new students("nithin",143);
	s1.display();
	s1.d1.displaydept();
	students.u1.displayuni();
	
	students s=new students("kumar",1432);
	s.display();
	s.d1.displaydept();
	students.u1.displayuni();
}
}

 
 
