class largest_in_array 
{
	public static void main(String[] args) 
	{
           int a[]={1,2,4,5,3,2,1 };
		   int n=a.length-1;
		   int l=0;
		   int s=0;
		   for (int i=0;i<=n ;i++ )
		   {
			    for (int j=0;j<=n ;j++ )
		   {
			   if (a[j]>l)
			   {
				   l=a[j];
			   }
			   else
			   {
				   s=a[j];
			   }
		   }
		   }
		System.out.println(l);
		System.out.println(s);
	}
}
