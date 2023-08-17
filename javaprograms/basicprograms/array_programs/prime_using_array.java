class prime_using_array 
{
	public static void main(String[] args) 
	{
		int a[]={2,5,6,9,7,0,1};
		for (int i=0;i<a.length ;i++ )
		{
			int n=a[i];
			boolean res=false;
		//	if(n>1) 
			{
			for (int j=2; j<n;j++ )
			{
				if (n%j==0)
				{
					res=true;
				}
			}
			}
			if (res==false)
			{
				System.out.println("prime"+n);
			}
			else
			{
				System.out.println("not a prime");
			}
		}
		System.out.println("Hello World!");
	}
}
