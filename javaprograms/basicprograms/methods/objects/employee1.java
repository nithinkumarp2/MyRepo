class employee1 
{
	static String cName="Qjspiders";
	static String cCeo="kashi";
	static String cAddress="dilusknagar";
	String eName;
	int eId;
	String ePhno;
	double eSal;
	String eAddress;

	public static void printCompanyDetails()
	{ 

		System.out.println(cName);
		System.out.println(cCeo);
		System.out.println(cAddress);
	}
	public void printEmployeeDetails()
	{
		System.out.println(eName);
		System.out.println(eId);
		System.out.println(ePhno);
		System.out.println(eSal);
		System.out.println(eAddress);
	}
	
	public static void main(String[] args) 
	{
		employee1 e1=new employee1();
		e1.eName="nithin";
		e1.eId=123;
		e1.ePhno="1235567899";
             printCompanyDetails();
			  e1.printEmployeeDetails();
			 System.out.println("Hello World!");
	}
}
