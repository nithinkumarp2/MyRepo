class strong_number 
{
	public static void main(String[] args) 
	{
		int n=145;
		int n1=n;
		int sum=0;
		while(n>0)
		{
			int digit=n%10;
			int fact=1;
			for (int i=1;i<=digit ;i++ )
			{
				fact*=i;
			}
			sum+=fact;
			n/=10;
		}
		if (sum==n1)
		{
			System.out.println("perfect number");
		}
		else
		{
		System.out.println(" not a perfect number");
		}
	}
}
