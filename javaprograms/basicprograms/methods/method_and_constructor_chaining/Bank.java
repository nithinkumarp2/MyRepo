class Bank 
{
	String cName;
	String cAddress;
	int cId;
	double cSal;
	int cAccNo;
//	String newName;
	Bank(String cName,String cAddress,int cId)
	{
		this.cName=cName;
		this.cAddress=cAddress;
		this.cId=cId;
	}
	Bank(String cName,String cAddress,int cId,double cSal,int cAccNo)
	{
		this(cName,cAddress,cId);
		this.cSal=cSal;
		this.cAccNo=cAccNo;
	}
	public void print()
	{
		System.out.println(cName);
		System.out.println(cAddress);
		System.out.println(cId);
		System.out.println(cSal);
		System.out.println(cAccNo);
	}
	public void changeName(String newName)
	{
		cName=newName;
		System.out.println("successflly changed the name");
		System.out.println("---------------------------------");
	}

	public static void main(String[] args) 
	{
		Bank b1=new Bank("manish","saidabad",143);
		b1.print();
		System.out.println("--------------------------------");
		//newName="akhil";
		b1.changeName("akhil");
		b1.print();

	}
}
