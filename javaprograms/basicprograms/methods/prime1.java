class prime1 
{
	public static void series(int n,int n1)
	{
		for (int i=n;i<=n1 ;i++ )
		{
			if (isprime(i))
			{
				//System.out.println(i);
			}
		}
	}
	public static boolean isprime(int n)
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
			System.out.println(n+"is prime");
		}
		//else
		{
		//	System.out.println(n+"is not a prime");
		}
		return res;
	}
	public static void main(String[] args) 
	{
		series(1,10);
		System.out.println("Hello World!");
	}
}
