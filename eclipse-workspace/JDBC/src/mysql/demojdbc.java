package mysql;
//Loading class `com.mysql.jdbc.Driver'. This is deprecated. The new driver class is `com.mysql.cj.jdbc.Driver'. The driver is automatically registered via the SPI and manual loading of the driver class is generally unnecessary.

import java.sql.*;

public class demojdbc {

	public static void main(String[] args)  {
		try {
		 Class.forName("com.mysql.jdbc.Driver");//com.mysql.cj.jdbc.Driver
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/demo","root","root");
		Statement st=con.createStatement();
		 String Query="select * from student where rollno=2";
		 ResultSet rs=st.executeQuery(Query);
		 rs.next();
		 String sname= rs.getString(2);
		 System.out.println(sname);
		 con.close();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}

}
