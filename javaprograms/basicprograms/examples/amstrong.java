class amstrong 
{
	public static void main(String[] args) 
	{
		int n=153;
		int n1=n;
		int n2=n;
		int sum=0;
		int c=0;
		while (n>0)
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
			sum=sum+power;
           n1/=10;
		}
		if (n2==sum)
		{
			System.out.println("amstrong");
		}
		else
		{
		System.out.println("not a amstrong"+sum);
		}
	}
}
