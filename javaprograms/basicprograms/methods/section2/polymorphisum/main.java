
class A
{
	int a=10;
	public void m1()
	{
		System.out.println("hiii");
	}
	public void m2()
	{
		System.out.println("byee");
	}
}
class B extends A
{
	int b=20;
	public void m1()
	{
		System.out.println("hello");
	}
}
class  main
{
	public static void main(String[] args) 
	{
		A a=new B();
		B b=(B)a;
		b.m1();
		//b.m2();
	//	A b=new A();
	//	b.m1();


		System.out.println(b.b);
	}
}
