class bank
{
	int accno;
	String name;
	bank(int accno,String name)
	{
		this.accno=accno;
		this.name=name;
	}
	public void setname( String name)
		{
		                  this.name=name;
		}  
}
class bank1 extends bank
{
	
	String adharno;
	String panno;
	bank1(int accno,String name,String adharno,String panno)
	{
		super(accno,name);
		this.adharno=adharno;
		this.panno=panno;
	}
	public String getadharno(String adharno)
	{
		return adharno;

	}
	public String getpanno(String panno)
	{
		return panno;
	}

public void display()
{
	System.out.println(accno);
	System.out.println(name);
	System.out.println(adharno);
	System.out.println(panno);
}
}
class  getset
{
	public static void main(String[] args) 
	{
           bank1 b1=new bank1(1234,"nithin","adhar12345","pan14568");
		   b1.display();
		   System.out.println("------------------------------------"); 
		System.out.println(b1.getadharno("15555adharno"));
	        b1.setname("chintu");
			b1.display(); 
	}
}
