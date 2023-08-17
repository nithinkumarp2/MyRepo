class perfect_number_using_array 
{
	public static void main(String[] args) 
	{
		int a[]={2,5,3,6,7,8};
		for (int i=0;i<a.length;i++ )
		{
			int n=a[i];
			int sum=0;
		 for (int j=1;j<n ;j++ )
		 {
			 if (n%j==0)
			 {
				 sum+=j;
			 }

		 }
			
			if (sum==n)
			{
				System.out.println("perfect number"+n);
			}
			else
			{
				System.out.println("not a perfect number"+n);
			}
		}
		
	}
}
