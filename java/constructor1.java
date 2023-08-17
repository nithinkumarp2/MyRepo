class Test 
{ 
	Test()
	{
		System.out.println("0-args cons");
	}
	Test(int a)
	{
       System.out.println("1-args cons");
	}
	Test(int a, double b)
	{
	System.out.println("2-args cons");
	}
	Test(int a,double b, char c)
	{
		System.out.println("3-args cons");
	}
	public static void main(String[] args)
	{
		Test  t=new Test();
        Test  t1=new Test(10);
		Test  t2=new Test(10,12.4);
		Test  t3=new Test(10,12.4,'a');
	}
}
