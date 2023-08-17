package student;

import java.sql.*;
import java.util.Scanner;

 
public class Dml {

	static String sname;
	static int sid;
	static long sphoneno;
	static int age;
	
	static Scanner sc=new Scanner(System.in);
	static Connection con;
	 public static void connection()
	 {
		 try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root", "root");
		} catch (Exception e) {
		    System.out.println(e.getMessage());
		}
	 }
	 
	 public void insert() throws Exception
	 {
		// System.out.println("inserted successfully"); 
		 String Query="insert into studentdetails(sname,sid,sphoneno,age) values(?,?,?,? )";
		
		 PreparedStatement st=con.prepareStatement(Query);
//		st.setString(1 ,"mani");
//		st.setInt(2, 765);
//		st.setLong(3, 454545747);
//		st.setInt(4, 24);
		 
		 System.out.println("Enter name");
		 st.setString(1,sc.next() );
		 System.out.println("enter id");
		 st.setInt(2, sc.nextInt());
		 System.out.println("enter phoneno");
		 st.setLong(3, sc.nextLong());
		 System.out.println("enter age");
		 st.setInt(4, sc.nextInt());
		 int rs=st.executeUpdate( );
		if(rs>0) {
		 System.out.println(rs+"=rows successfully inserted");
		}
		else {
			System.out.println("insertion failed1");
		}
//		System.out.println("if you want to insert data PREE 'YES',or'NO'");
//		String  YES=sc.next();
//		String NO = null;
//		//  if(YES==YES&&YES==NO)
//		{
//			insert();
//		}
//		  else
//		  {
//			  System.out.println("continue the process");
//			  choice();
//			//  fetch();
//			  
//		  }
	 }
	 
	 
	 public void fetch() throws SQLException
	 {
		 System.out.println("select the coloumns name as 'sid_no:'");
		 
		 Statement st=con.createStatement();
		
		 String Quert="select * from studentdetails where   sid ="+  Integer.parseInt(sc.next());
		// System.out.println("enter idnumer example= 22&&sid=22");
		 
		 ResultSet rs=st.executeQuery(Quert);
	//	 rs.next();
		
		  while(rs.next()) 
		 {
			// System.out.println(rs .getRowId(sc.nextInt()));
//			 System.out.println("enter selected name and pressENTER");
//			 System.out.println("select the coloumn number");
			 	 
			 
		  String sname="NAME"+rs.getString(1)+" ID: "+rs.getString(2)+" PHONENO: "+rs.getString(3)+" AGE: "+rs.getString(4);
		 System.err.println(sname);
		 }
			  
		 
		
	 }
	 
	 
	 public static void update() throws SQLException {
		 System.out.println("Enter sid");
		 int id=sc.nextInt();
		 String Query="select * from studentdetails where sid= "+id;
		 Statement statement=con.createStatement();
		 ResultSet rs=statement.executeQuery(Query);
		 rs.next();
		 String name =rs.getString(1);
		 int id1= rs.getInt(2);
		 long phoneno =rs.getLong(3);
		int age=rs.getInt(4);
		 System.out.println();
		 System.err.println("name "+name+", id "+id1+", phoneno "+phoneno+", age "+age);
		
		 System.out.println("Enter your chooice");
		 System.out.println("1.updated name");
		 System.out.println("2.updated id");
		 System.out.println("3.updated phone");
		 System.out.println("4.updated age");
		 int choice=sc.nextInt();
		 String sql="";
		 switch(choice)
		 {
		 case 1:
			 System.out.println("Enter newname");
			 String newname= sc.next();
			  String Query1="update studentdetails set sname = ? where sid = "+id1;
			  PreparedStatement preparedStatement= con .prepareStatement(Query1);
			  preparedStatement.setString(1, newname);
			  int row=preparedStatement.executeUpdate();
			 
			  System.out.println(row+" updated name successfully");
			 break;
			 
		 case 2:
			 System.out.println("enter new id");
			 int newid=sc.nextInt();
			 String Query2="update studentdetails set sid = ? where sid ="+id1;
			 PreparedStatement preparedStatement1= con.prepareStatement(Query2);
			  preparedStatement1.setInt(1, newid);
			int row1=  preparedStatement1.executeUpdate();
			 System.out.println("updated id successfully");
			 break;
		 case 3:
			 System.out.println("enter new phone number");
			 long newphno=sc.nextLong();
			 String Query3="update studentdetails set sphoneno = ? where sid ="+id1;
			 PreparedStatement preparedStatement2= con.prepareStatement(Query3);
			  preparedStatement2.setLong(1, newphno);
			int row2=  preparedStatement2.executeUpdate();
			 System.out.println(row2+" row updated phonenumber successfully");
			 break;
		 case 4:
			 System.out.println("enter new age");
			 int newage=sc.nextInt();
			 String Query4="update studentdetails set age = ? where sid ="+id1;
			 PreparedStatement preparedStatement3= con.prepareStatement(Query4);
			  preparedStatement3.setInt(1, newage);
			int row3=  preparedStatement3.executeUpdate();
			 
			 System.out.println(row3+" row updated age successfully");
			 break;
			 
			 default: 
				 System.out.println("invalid data entered");
			
			 break;
		 }
		 
		
	 }
	 
	 
	 public static void delete() throws SQLException {
		 System.out.println("Enter deleted id");
		 int did=sc.nextInt();
		 String Query="delete from studentdetails where sid= "+did; 
		 Statement  Statement=con.createStatement( );
		 
	       int rs= Statement.executeUpdate(Query);
		 
		 System.out.println(rs+ " row deleted  successfully");
	 }

	 
	 
	  public void choice() throws Exception {
			
			boolean result=true;
			while (result) {
				System.out.println("ENTER YOUR CHOOICES");
				System.out.println("1.Enter to insert");
				System.out.println("2.Enter to fetchdata");
				System.out.println("3.Enter to updatedata");
				System.out.println("4.Enter to Deletedata");
				System.out.println("5. Exit");
				int choice=sc.nextInt();
			switch (choice) {
			case 1:
				 insert();
				// choice();
				break;
		   
			case 2:
				 fetch();
			//	 choice();
				break;
				
			case 3:
				update();
			//	choice();
				break;
				
			case 4:
				delete();
			//	choice();
				break;
				
			case 5:
				System.out.println("exited successfully");
				result=false;
				break;
			default:System.out.println("some thing went wrong");
				break;
			}
			        }
	  }//end while loop
	public static void main(String[] args)     {
		
 	
 	
	        Dml d=new Dml();
	     
	        try {
	        	connection();
				  d.choice();
			 	  
			} catch (Exception e) {
				 System.out.println(e.getMessage());
				e.printStackTrace();
			}
	     

	}
	
}
