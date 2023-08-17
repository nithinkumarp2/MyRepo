package mysql;

import java.sql.*;

/*
 * 1.import
 * 2.load and register the driver
 * 3.create the connection
 * --> we have to download jar files (mysql connecter jar )
 * 
 * 4.create the statement
 * 5. execute the query
 * 6.process the result
 * 7.cose
 */
public class democlass {

	public static void main(String[] args) throws Exception {
		String url="jdbc:mysql://localhost:3306/demo";
		String uname="root";
		String pass="root";
		String Query="select * from student where rollno=4  ";
		 
		//1. load and register driver
		
		 Class.forName("com.mysql.cj.jdbc.Driver");
		 
		 //2. establish the connection
		 
		 Connection con=DriverManager.getConnection(url,uname,pass) ;
		 
		 //3.  establish the statements
		 
         Statement st=con.createStatement();
         
         //4. execute the statements
         
        ResultSet rs= st.executeQuery(Query);
        rs.next();
        String name=rs.getString( "sname");
        System.out.println(name);
        
        
        String details="select * from student";
        ResultSet r=st.executeQuery(details);
        while(r.next())
        {
        	String dd=r.getInt(1)+" "+r.getString(2);
        	System.out.println(dd);
        }
        
        
        //close
        con.close();
        st.close();
	}

}
