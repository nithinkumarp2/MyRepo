class strong_number_using_array 
  
{
	public static void main(String[] args) 
	{
		int a[]={223,22,165,125,625,145};
		for (int i=0;i<a.length;i++ )
		{
			int n=a[i];
			int n1=n;
			int sum=0;
			while (n>0)
			{
				int digit=n%10;
				int product=1;
				for(int j=1;j<=digit;j++)
				{
				product=product*j;
				}
				sum=sum+product;
				n/=10;
			}
			if (sum==n1)
			{
				System.out.println("strong number"+n1);
			}
			else
			{
				System.out.println("not a strong   number"+n1+"="+sum);
			}
		}
		
	}
}
