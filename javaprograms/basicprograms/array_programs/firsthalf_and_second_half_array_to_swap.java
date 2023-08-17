class firsthalf_and_second_half_array_to_swap 
{
	public static void main(String[] args) 
	{
	
		int[] a={1,8,39,32,8,35,4,38,41,1};
		int n=a.length-1;
		for (int i=0;i<=n ;i++ )
		{
			for (int j=0;j<n/2-1 ;j++ )
			{
				if(a[j]>a[j+1])
				{
				int ele=a[j];
				a[j]=a[j+1];
				a[j+1]=ele;
				}
			}
		//	System.out.println(a[i]);
		
			for (int j=n/2;j<=n-1 ;j++ )
			{
				if(a[j]>a[j+1])
				{
				int ele=a[j];
				a[j]=a[j+1];
				a[j+1]=ele;
				}
			}
		}
			for (int i=0; i<=n;i++ )
			{
		System.out.println(a[i]);
			}
	}
}
