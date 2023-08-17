interface A
{
	public static void m1()
	{
		 
	}
	public void m2();
	public void m3();

}
class B implements A
{
	public static void m1()
	{
		System.out.println("this is m1");
	}
	public void m2()
	{
		System.out.println("this is m2");
	}
	public void m3()
	{
         System.out.println("this is m3");
	}
}


class  main1
{
	public static void main(String[] args) 
	{
		B b1=new B();
		b1.m2();
		b1.m1();
		System.out.println("Hello World!");
	}
}
