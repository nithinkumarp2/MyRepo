class employee
{
	String name;
	int id;
	double sal;
	employee(String name,int id,double sal)
	{
		this.name=name;
		this.id=id;
		this.sal=sal;
	}
	public void setName(String newname)
	{
		name=newname;
	}
	public void setId(int newid)
	{
		id=newid;
	}
	public void setsal(double newsal)
	{
		sal=newsal;
	}
}
class employee1 extends employee
{
	char gender;
	String loc;
	long phno;
	employee1(String name,int id,double sal,char gender,String loc,long phno)
	{
		super (name,id,sal);
		this.gender=gender;
		this.loc=loc;
		this.phno=phno;
	} 
		public void setGender(char newgender)
		{
			gender=newgender;
			System.out.println(gender);
		}
		public void setLoc(String newloc)
		{
			loc=newloc;
		}
		public void setPhno(long newphno)
		{
			phno=newphno;
		}
     
  public void display1()
	{
	//super();// name,id,sal,gender,loc,phno
	System.out.println(gender);
    System.out.println(loc);
	System.out.println(phno);
	}
}
class mainclass1
{
	public static void main(String[] args) 
	{
		employee1 e1=new employee1("gopi",143234,123345.00,'m',"karmanghat",82478732);
	//	e1.display();
	e1.display1();
	   employee1 e2=new employee1();
         e2.setGender('f');
		System.out.println("Hello World!");
	}
}
