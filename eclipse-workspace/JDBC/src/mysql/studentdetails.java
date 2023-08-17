package mysql;

import java.sql.*;
//import java.sql.DriverManager;

class student
{
	int rollno;
	String sname;
}

class studentD  extends student
{
	 Connection con=null;
	public void getconnection() throws  Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		  con=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "root");	
	}
	public student getstudent(int rollno) throws Exception
	{
		student s=new student();
		s.rollno=rollno;
		 
		
		Statement st=con.createStatement();
		String Query="select sname from student where rollno=3";
		ResultSet rs=st.executeQuery(Query);
		rs.next();
		String name=rs.getString(1);
		s.sname=name;
		return s;
		
	}
//	or
	public  int getname(int rollno)
	{
		this.rollno=rollno;
		return rollno;
		
	}
	 
	public void addstudent(student student) throws Exception
	{
		String Query="insert into student values( ?,?)";
//		Statement st=con.createStatement();"+ uid +", '"+ uname +"'
		PreparedStatement ps=con.prepareStatement(Query);
		ps.setInt(1, student.rollno);
		ps.setString(2,student.sname);
		int count=ps.executeUpdate();
		System.err.println(count+"row added successfully");
		 
	}
}

public class studentdetails {

	public static void main(String[] args) throws Exception {
		
		studentD dao=new studentD();
		dao.getconnection();
		 student s1=dao.getstudent(4);
		 System.out.println(s1.sname);
//		 dao.addstudent();
		 
		 student s2=new student();
		 s2.rollno=8;
		 s2.sname="pradeep";
	//	 dao.addstudent(s2);
	}

}
