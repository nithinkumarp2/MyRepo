class method 
{
	public static void wish() 
	{
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println(c);
	}

	public static void wish1() 
	{
		int n=1634;
		int n1=n,n2=n;
		int count=0;
		int c=0;
		int sum=0;
		while(n>0)
		{
			n/=10;
			c++;
		}
		while (n1>0)
		{
			int digit=n1%10;
			int power=1;
			for (int i=1;i<=c ;i++ )
			{
				power=power*digit;
			}
                 sum+=power;
				 n1/=10;
		}
		if (sum==n2)
		{
			System.out.println("amstrong number");
		}
		else
		{
		System.out.println("not a amstrong ");
		}
	}
	public static void wish2() 
	{
		System.out.println(" World!");
	}
	public static void main(String[]args)
	{
		wish1();
	}
}
