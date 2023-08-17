class ThisTest 
{
	ThisTest()
	{
		System.out.println("0-args const");
	}
	ThisTest(int a)
	{
		this();
		System.out.println("1-args const");
	}
	ThisTest(int a,int b)
	{
		this(10);
		System.out.println("2-args const");
	}
	public static void main(String[] args)
	{
		new ThisTest(10,20);
	}
}
