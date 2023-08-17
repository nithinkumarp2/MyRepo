class perfect_number 
{
	public static void main(String[] args) 
	{
		int n=6;
		int n1=n;
		int sum=0;
		for (int i=1;i<n-1 ;i++ )
		{
			if (n%i==0)
			{
				sum+=i;
			}
		}
		if (sum==n1)
		{
			System.out.println("perfect number");
		}
		else
		{
		System.out.println("not a perfect number");
		}
	}
}
