class employee // by this kayword
{
	static String cName="Qspiders";
	static String cCeo="kashi";
	static String cAddress="dilusknagar";
	String eName;
	int eId;
	String ePhno;
	double eSal;
	String eAddress;

	public void initialize(String eName, int eId, String ePhno, double eSal,String eAddress)
	{
        this. eName=eName;
	    this. eId=eId;
	    this. ePhno=ePhno;
	    this. eSal=eSal;
	    this. eAddress=eAddress;
	}
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
		
		employee e1=new employee();
		e1.initialize("nithin",123,"12345677890",555555.55,"sarorrnage");
         printCompanyDetails();
		e1.printEmployeeDetails();
              System.out.println("----------------------------***------------------------");
			  employee e2=new employee();
           e2.initialize("mota",345,"98765432111",5555.55,"saidabad");
         printCompanyDetails();
		e2.printEmployeeDetails();
		
	}
}
