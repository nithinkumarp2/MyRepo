package student;

import java.sql.*;
import java.util.Scanner;
public class studentdetails {
         String sname;
         int sid;
        long sphoneno;
         int age;
	public studentdetails(String sname,int sid,long sphoneno,int age) {
		   this.sname=sname;
		   this.sid=sid;
		   this.sphoneno=sphoneno;
		   this.age=age;	   
	}
//	 public void setsname(String sname)
//	   {
//		   this.sname=sname;
//	   }
//	  public String getsname()
//	  {
//		  return sname;
//	  }
//	  public void setsid(int sid)
//	  {
//		 this.sid=sid; 
//	  }
//	  public int getsid()
//	  {
//		  return sid;
//	  }
//	  public void setsphoneno(long sphoneno)
//	  {
//		  this.sphoneno=sphoneno;
//	  }
//	  public long getsphoneno()
//	  {
//		  return sphoneno;
//	  }
//	  public void setage(int age)
//	  {
//		  this.age=age;
//	  }
//	  public int getage()
//	  {
//		  return age;
//	  }
	  
	  //jdbc connection
        static Connection con;
	  public void connection()
	  {
		  try
		  {
			  Class.forName("com.mysql.cj.jdbc.Driver");
			  con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");
		  }
		  catch(Exception e)
		  {
			  System.out.println(e);
		  }
	  }
	  
	  public void insert()
	  {
		  try {
			  String Query="insert into studentdetails values(?,?,?,?) ";
		//	  String Query="insert into studentdetails values('"+sname+"',"+sid+","+sphoneno+","+age+")";
			  /*
			   * the above query is used as runtime details 
			   * insert details at the same time  as declaration and initialization time 
			   */
			PreparedStatement st=con.prepareStatement(Query);
			st.setString(1, sname);
			st.setInt(2,sid);
			st.setLong(3,sphoneno );
			st.setInt(4, age);
			int count=st.executeUpdate();
			
		      
	//		if (count==1) 
			{
				System.out.println(count+"inerted successfully");
				
			}
		  // else
			{
				//System.err.println("insersation failed");  
			}
			
		} catch ( Exception e) {
			System.out.println(e.getMessage());
		}
		  
	  }
	 
	  
	  public   void delete(  ) throws Exception
	  {
		 Scanner sc=new Scanner(System.in);
		String Query="delete from studentdetails where sname= 'akhil'";
		 System.out.println("enter the delete name"+sname);
		 String name=sc.next();
		Statement st=con.createStatement();
		int count=st.executeUpdate(Query);
		System.out.println(count+"successfully deleted"+sname);
	  }
	  
	  
	public static void main(String[] args) throws Exception {
		 studentdetails d= new studentdetails("nithin",123,98755,24);
		 studentdetails d1= new studentdetails("kumar",456,88654,25);
		 studentdetails d2= new studentdetails("manish",789,55876,26);
		 studentdetails d3= new studentdetails("akhil",269,22225588,27);
		 studentdetails d4= new studentdetails("anil",587,666666666,28);
		 d.connection();
		  d.insert( );
		// d2.connection();
		  d2.insert();
		// d3.connection();
		   d3.insert();
		// d4.connection();
	//	 if(d4 != null) {
		   d4.insert();
 	 d2. delete( );
		 
		
		
		// d.getsname();
		// d.setsname("nithin");
		 

	}

}

 
