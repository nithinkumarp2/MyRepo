class  variable
{
	static int x=100,y=200;
	int a=10,b=20;
	void m1()
	{
		System.out.println(" method1");
		System.out.println(a);
		System.out.println(b);
		System.out.println(x);
		System.out.println(y);
	}
	static void m2()
	{
		variable v=new variable();
System.out.println(" method2");
		System.out.println(v.a);
		System.out.println(v.b);
		System.out.println(v.x);
		System.out.println(v.y);
	}
	  public static void main(String[]args)
	{
		variable v=new variable();
		v.m1();
		variable.m2();
	}
}