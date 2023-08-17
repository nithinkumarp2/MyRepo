package Hospital_details;

public class Employees {
             public String eName;
             public int eId;
             public double eSal;
             public String eaddress;
//             Hospital.hspt("hhhhh",11111);
//             hDepartments.dDetails("yyyy",2222);
             public void employee(String name,int id,double sal,String address)
             {
            	 this.eName=name;
            	 this.eId=id;
            	 this.eSal=sal;
            	 this.eaddress=address;
             }
             public void displayemp()
             {
            	 System.out.println("employee name is "+eName);
            	 System.out.println("employee id is "+eId);
            	 System.out.println("employee salary is "+eSal);
            	 System.out.println("employee address is "+eaddress);
             }
}
