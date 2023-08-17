class number_is_strong_or_not 
{
	public static void main(String[] args) 
	{
		int n=145,sum=0; int n1=n;
		while (n>0)
		{
		int	 digit=n%10;
		int prod=1;   
		for (int i=1;i<=digit ;i++ )
		{
			//if (digit%i==0)
			{
				prod*=i  ;
			}

		}

			
			sum+=prod;
			n/=10;
		}
		
		if (sum==n1)
		{
			System.out.println("the given number is perfect"+sum);
		}
			else
		{
		System.out.println("the given number is not perfect"+sum);
		}
	}
}
