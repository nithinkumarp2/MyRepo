package Hospital_details;

public class hDepartments {
               public String dName;
               public int dId;
               public void dDetails(String name, int id)
               {
            	   this.dName=name;
            	   this.dId=id;
               }
               
               public void displaydept()
               {
            	   System.out.println("depatment name is "+dName);
            	   System.out.println("department id is "+dId);
               }
}
