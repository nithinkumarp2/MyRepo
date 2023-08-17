class Bank1 
{
	static String bName="UION BANK";
	static String bIfc="UIIFC0000000";
	static String bAddress="karmanghat";
	static String bManagerName="mota";
	static String bGoldLoan="5.5per";
	String cName;
	String cAddress;
	 
	int cId;
	double cBal;
	 double cWithdrwal;
	String cAdhar;
	String cPan;
	Bank1( String cName,double cBal)
	{
		this.cName=cName;
		this.cBal=cBal;
	}
	Bank1(String cName,double cBal,int cId)
	{
		this(cName,cBal);
		this.cId=cId;
	}
	Bank1(String cName,double cBal,int cId,String cAddress,String cPan)
	{
      this(cName,cBal,cId);
	  this.cAddress=cAddress;
	  this.cPan=cPan;
	}
    Bank1(String cName,double cBal,int cId,String cAddress,String cPan ,String cAdhar,double cWithdrwal)
	{
		this(cName,cBal,cId,cAddress,cPan);
		this.cAdhar=cAdhar;
		this.cWithdrwal=cWithdrwal;
	}
	public void Withdrwal()
	{
		if (cWithdrwal< cBal)
		{
		
		cBal=cBal-cWithdrwal;
		
		System.out.println("withdrwal successfully and withdrwal amount is "+cWithdrwal);
	//	System.out.println("----------------------------------------------------");
		System.out.println("total balance is"+cBal);
		System.out.println("----------------------------------------------------");
		}

		else
		{
			System.out.println("in-sufficent balance");
		}
	}
public void Deposite(double cDeposite)
	{
		cBal=cBal+cDeposite;
		System.out.println("Deposite successfully and deposite amount is "+cDeposite);
		System.out.println("total balance is"+cBal);
		System.out.println("----------------------------------------------------");
	}

	public void display()
	{
		System.out.println( bName);
		System.out.println( bIfc);
		System.out.println( bAddress);
		System.out.println( bManagerName);
		System.out.println( bGoldLoan);
		System.out.println( cName);
		System.out.println( cAddress);
		System.out.println( cId);
		System.out.println( cBal);
		System.out.println(cWithdrwal); 
		System.out.println( cAdhar);
		System.out.println( cPan);
	}

	public static void main(String[] args) 
	{
//		Bank1 v1=new Bank1("nithin",70000.00);
//		v1.display();
//		System.out.println("----------------------------------------------------");
 //          v1.Withdrwal(  );
	//	   v1.display();
//		   System.out.println("----------------------------------------------------");
//		   v1.Deposite(10000.00);
//		   v1.display();
//		   System.out.println("----------------------------------------------------");
//		   Bank1 v2=new Bank1("nithin",700000.00,143,"karmanghat","PAN122345" ,"ADHAR567899",20000.00);
//		   v2.display();
  //         System.out.println("----------------------------------------------------");
//		   v2.Withdrwal();
//		   v2.display();
//		    System.out.println("----------------------------------------------------");
//			v2.Deposite(700000.00);
//			  System.out.println("----------------------------------------------------");
			  Bank1 v3=new Bank1("kumar",00000.00,143,"karmanghat","PAN122345" ,"ADHAR567899",20000.00);
                 v3.display();
				   v3.Withdrwal();
		
	}  
}
