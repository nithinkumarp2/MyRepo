class employee 
{
	String eName;
	int eId;
	String eAddress;
	String ePhno;
    String eSal;
	int eAge;
	String ePan;

	employee(String eName,int eId,String eAddress,String ePhno,String eSal,int eAge,String ePan)
	{
		this.eName=eName;
        this.eId=eId;
	this.eAddress=eAddress;
	this.ePhno=ePhno;
    this.eSal=eSal;
	this.eAge=eAge;
	this.ePan=ePan;
	}
	employee(String eName,int eId,String eAddress,String ePhno,String eSal)
	{
		this.eName=eName;
        this.eId=eId;
	this.eAddress=eAddress;
	this.ePhno=ePhno;
    this.eSal=eSal;

	}
	employee(String eName,int eId)
	{
		this.eName=eName;
        this.eId=eId;
	}
	public void printemployeedetails()
	{
		System.out.println(eName);
		System.out.println(eId);
		System.out.println(eAddress);
		System.out.println(ePhno);
		System.out.println(eSal);
		System.out.println(eAge);
		System.out.println(ePan);
	}
	public static void main(String[] args) 
	{
		employee e1=new employee("nithin",123,"karmanghat","999999999999","50thousand",23,"1234PAN345");
		e1.printemployeedetails();
		System.out.println("---------------------------------------------------------");
		employee e2=new employee("mota",789,"saidabad","999988888888","50thousand");
		e2.printemployeedetails();
		System.out.println("---------------------------------------------------------");
		employee e3=new employee("akhil",456);
		e3.printemployeedetails();
	}
}
