class max_ele_in_array 
{
	public static void main(String[] args) 
	{
		int[]a={1,2,3,4};
		int n=a.length-1;
		int max=a[0];
		for (int i=0;i<=n ;i++ )
		{
			for (int j=0; j<=n-1;j++ )
			{

			}
			if (max<a[i])
			{
				max=a[i];
			}
		}
		System.out.println(max);
	}
}
