package programs1;
 
   class employee    
{
	private String eName;
	private int eid;
	private double esal;
	private long ephno;
	
	 public employee(String name,int id,double esal,long phno)
	{
		this.eName=name;
		this.eid=id;
		this.esal=esal;
		this.ephno=phno;
	}
	public void setname(String newName)
	{
		this.eName=newName;
	}
	public void setid(int newId)
	{
		this.eid=newId;
	}
	public void setsal(double newsal)
	{
		this.esal=newsal;
	}
	public void setphno(long newphno)
	{
		this.ephno=newphno;
	}
	public String getname()
	{
		return this.eName;
	}
	public int getid()
	{
		return this.eid;
	}
	public double getsal()
	{
		return this.esal;
	}
	public long getphno()
	{
		return this.ephno;
	}
	
	public void displauAll()
	{
		System.out.println("employee NAME is:"+getname());
		System.out.println("employee ID is:"+getid());
		System.out.println("employee SAL is:"+getsal());
		System.out.println("employee PHNO is:"+getphno());
	}
}






public class encapsulation {

	public static void main(String[] args) {
		 employee e=new employee("raja",143,70000.0,9640369880l);
              e.displauAll();
              System.out.println("-------updated employee details----------");
              e.setname("nithin");
              
              e.displauAll();
	}

}
