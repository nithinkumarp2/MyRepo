class while_using_perfectnum 
{
	public static void main(String[] args) 
	{
		int n=6,m=1; int sum=0;
		while (m<n)
		{
			
			 if(n%m==0) 
			{
           sum+=m;
			}
			m++;
		}
		if (sum==n)
		{
			System.out.println(" the given number is perfect number"+sum);
		}
		else
		{
		System.out.println(" the given number is not a perfect number"+sum);
			

		}
	}
}
