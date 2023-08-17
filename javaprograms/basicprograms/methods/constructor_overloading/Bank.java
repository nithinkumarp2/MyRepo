class Bank 
{
	static String bName="union bank";
	static String bAddress="karmanghat";
	static String bIfccode="ANDra00111";
	static String bManagerName="nithin";
	String cName;
	String cCountno;
	String cPhno;
	String cAge;
	String cEmail;
	String cAdhar;
	String cPan;
	String cGender;
	double cBalance;
	double cLoanamount;
Bank(String cName,String cCountno,String cPhno,String cAge,String cEmail,String cAdhar,String cPan,String cGender,double cBalance,double cLoanamount)
	{
	    this.cName=cName;
	this.cCountno=cCountno;
	this.cPhno=cPhno;
	this.cAge=cAge;
	this.cEmail=cEmail;
	this.cAdhar=cAdhar;
	this.cPan=cPan;
	this.cGender=cGender;
	this.cBalance=cBalance;
	this.cLoanamount=cLoanamount;
	}
Bank(String cName,String cCountno,String cPhno,String cAge,String cEmail,String cAdhar,String cPan,String cGender)
	{
	    this.cName=cName;
	this.cCountno=cCountno;
	this.cPhno=cPhno;
	this.cAge=cAge;
	this.cEmail=cEmail;
	this.cAdhar=cAdhar;
	this.cPan=cPan;
	this.cGender=cGender;
	}
	Bank(String cName,String cCountno,String cPhno,String cAge,String cEmail)
	{
	    this.cName=cName;
	this.cCountno=cCountno;
	this.cPhno=cPhno;
	this.cAge=cAge;
	this.cEmail=cEmail;
	}
	Bank(String cName)
	{
	    this.cName=cName;
	}
	public void printBankDetails()
	{
		System.out.println(bName);
		System.out.println(bAddress);
		System.out.println(bIfccode);
		System.out.println(bManagerName);
		System.out.println(cName);
		System.out.println(cCountno);
		System.out.println(cPhno);
		System.out.println(cAge);
		System.out.println(cEmail);
		System.out.println(cAdhar);
		System.out.println(cPan);
		System.out.println(cGender);
		System.out.println(cBalance);
		System.out.println(cLoanamount);

	}
	public static void main(String[] args) 
	{
		Bank b1=new Bank("nithin","123Acco00","1234568889","23","nithinkumar@gmail.com","ADHA12345","EPAN678900","male",10000000000.0,0);
		b1.printBankDetails();

		System.out.println("-------------------==========================---------------------");
		
		Bank b2=new Bank("nithin","123Acco00","1234568889","23","nithinkumar@gmail.com");
		b2.printBankDetails();
		System.out.println("=========================================++++++++++++================================");
		
		Bank b3=new Bank("nithin");
		b3.printBankDetails();
	}
}
