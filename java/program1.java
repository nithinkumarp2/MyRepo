class variable
{
	int a=10,b=20;
	void display()
	{
		System.out.println("display1 method");
			System.out.println(a);
			System.out.println(b);
	}
	static  void display2()
	{
		variable v=new variable();
	System.out.println("display2 method");
		System.out.println(v.a);
		System.out.println(v.b);
	}
	public static void main(String[]args)
	{
		variable v=new variable();
		v.display1();
		v.displasy2();
	}
}
