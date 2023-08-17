interface I
{
	void m1();
}
class A implements I
{
	public void m1()
	{
		System.out.println("m1 method is class A");
	}
}


class  main
{
	public static void main(String[] args) 
	{
		I i=new A();
		i.m1();
		System.out.println("Hello World!");
	}
}
