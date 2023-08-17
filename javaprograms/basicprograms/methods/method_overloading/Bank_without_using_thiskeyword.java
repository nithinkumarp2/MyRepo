class Bank_without_using_thiskeyword
{
	String name;
	int age;
	String salary;
	String phno;
	String addhar;
	String panNum;
	String name1;
	public void initilize(String name,int age,String salary,String phno,String addhar,String panNum,String name1)
	{
		this.name=name;
		this.name1=name1;
	this.age=age;
	 this.salary=salary;
	this.phno=phno;
	 this.addhar=addhar;
	this.panNum=panNum;
	}
	public void initilize(String name,int age,String salary,String phno)
	{
		this.name=name;
	this.age=age;
	 this.salary=salary;
	this.phno=phno;
	  
	}
	public void display1()
	{
		System.out.println(name);
		System.out.println(age);
		System.out.println(salary);
		System.out.println(phno);
		  
	}
	public void display()
	{
		System.out.println(name);
		System.out.println(age);
		System.out.println(salary);
		System.out.println(phno);
		System.out.println(addhar);
	System.out.println(panNum);
	System.out.println(name1);  
	}
   


	public static void main(String[] args) 
	{
		Bank_without_using_thiskeyword b=new Bank_without_using_thiskeyword();
		b.initilize("nithin",23,"5555555555","1234567890");
		b.display1();
		b.initilize("nithin",23,"5555555555","1234567890","111112222333344","PAN12334FBN","kumar");
		b.display();
		
		System.out.println("Hello World!");
	}
}
