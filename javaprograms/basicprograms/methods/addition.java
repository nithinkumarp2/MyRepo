class addition 
{
	public static void add(int a,int b)
	{
		System.out.println(a+b);
	}
	public static void add(double a,int b)
	{
		System.out.println(a+b);
	}
	public static void add(int a,double b)
	{
		System.out.println(a+b);
	}
	public static void add(double a,double b)
	{
		System.out.println(a+b);
	}
	public static void main(String[] args) 
	{
		add(2,3);
		add(1.2,4);
		System.out.println("Hello World!");
	}
}
