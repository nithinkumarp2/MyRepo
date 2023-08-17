class  max_value_for_all_even_index  
{
	public static void main(String[] args) 
	{
		int a[]={1,2,7,3,6,4};
		int n=a.length-1;
		int b[]=new int[n+1];
		int max=b[0];
		for (int i=0;i<=n ;i++ )
		{
			if (i%2!=0&&i!=0)
			{
				b[i]=a[i];
				 if (max<b[i])
				 {
					 max=b[i];
				 }
				}
		}
		for (int i=0;i<=n ;i++ )
		{
			if (b[i]!=0)
			{
		System.out.println("maximum value is "+max+"="+b[i]);
			}
		}
	}
}
