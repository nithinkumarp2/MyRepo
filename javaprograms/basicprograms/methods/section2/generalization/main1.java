class z
{
	public void m1()
	{
		System.out.println("A");
	}
	public void m2()
	{
		System.out.println("B");
	}
	public void m3()
	{
		System.out.println("C");
	}
	public void m4()
	{
		System.out.println("D");
	}
}
class x extends z
{
}
class y extends z
{
	
}




class  main1
{
	public static void display(z var)
	{
		var.m1();
		var.m2();
		var.m3();
		var.m4();
//		System.out.println("A");
	}
	public static void main(String[] args) 
	{
		x x1=new x();
         y y1=new y();
          display(x1);
		  display(y1);
		  new z().m1();
		System.out.println("Hello World!");
	}
}
