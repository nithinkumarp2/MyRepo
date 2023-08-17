package Hospital_details;

public class Hospital {
           public String hName;
           public String hAddress;
           
           public void hspt(String name,String address)
           {
        	   this.hName=name;
        	   this.hAddress=address;
           }
           public void displayhosp()
           {
        	   System.out.println("hospital name is "+hName);
        	   System.out.println("hospital address is "+hAddress);
           }
}
