abstract class A
{
	 abstract public void m1();
	abstract public void m2();
} 
class B extends A 
{
public void m1()
	{
	System.out.println("this is m1");
	}

	public void m2()
	{
	System.out.println("this is m2");
	}
}
class main1
{
	public static void main(String[] args) 
	{
		B b1=new B();
		b1.m1();
		System.out.println("Hello World!");
	}
}
