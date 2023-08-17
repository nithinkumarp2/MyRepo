class prime 
{
	public void m1(int n)
	{ 
		boolean res=false;
		for (int i=2;i<=n-1 ;i++ )
		{
			if (n%i==0)
			{
                res=true;
			}
		}
		if (res==false)
		{
			System.out.println("the given number is prime");
		}
		else
		{
			System.out.println("the given number is not a prime");
		}
	}
	public static void main(String[] args) 
	{
		prime rv=new prime();
		rv.m1(6);
		rv.m1(3);
		rv.m1(7);
		rv.m1(8);
		System.out.println("Hello World!");
	}
}
