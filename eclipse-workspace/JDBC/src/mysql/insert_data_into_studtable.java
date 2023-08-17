package mysql;

import java.sql.*;

 

public class insert_data_into_studtable {
       
	public static void main(String[] args) throws Exception {
//		 Class.forName("com.mysql.cj.jdbc.Driver");
//		 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","root");
//		 Statement st=con.createStatement();
//		 String Query= "insert into student values(5,'santosh')";
//		 int count =st.executeUpdate(Query);
//		 System.out.println(count+" effected rows");
		
		
//		insertion.insert();
		
		
// 		insertion.delete();
		
		insertion.update();
	}

}

/*
 * another way of insertion prepared
 */
class insertion  
{
	public static void insert() throws  Exception
	{
		 String uname="nithin";
		 int uid=6;
		 Class.forName("com.mysql.cj.jdbc.Driver");
		 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "root");
		 
		String Query="insert into student values("+ uid +", '"+ uname +"')";
		PreparedStatement ps= con.prepareStatement(Query);
		int count =ps.executeUpdate();
		System.out.println(count+"rows effected");
		
	}
	
	
	public static void delete() throws Exception
	{
	   Class.forName("com.mysql.cj.jdb c.Driver");
	   Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","root");
	   Statement st=con.createStatement();
	   String Query="delete from student where sname='santosh'";
	   int rs=st.executeUpdate(Query);
	   System.out.println(rs+"=rows deleted successfully");
	}
	
	
	public static void update() throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","root");
		Statement st=con.createStatement();
		String Query="update student set sname='akhil' where sname='nikfil'";
		int rs=st.executeUpdate(Query);
		System.out.println(rs+"=row updated sucessfully");
	}
}


