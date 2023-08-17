class methods 
{
	void m1()
	{
		System.out.println("0-args instance methods");
	}
	void m2(int a)
	{
		m3();
		System.out.println("1-args instance methods");
	}
	static void m3()
	{
		methods m=new methods();
		m.m1();
        System.out.println("0-args static methods");
	}
static void m4(int a)
	{
	methods m=new methods();
	m.m2();
       System.out.println("1-args static methods");
	}
	public static void main(String []args)
	
	{
		methods.m4(100);

}
}