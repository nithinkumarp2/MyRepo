class swaping_1st_and_last_values_in_array 
{
	public static void main(String[] args) 
	{
		int a[]={3,8,21,51,32,41,89};
		int min=a[0];
		int max=a[0];
		int max_index=0;
		int min_index=0;
		for (int i=0;i<a.length ;i++ )
		{
			int n=a[i];
			if (max<n)
			{
				max=n;
				max_index=i;
			}
			if (min>n)
			{
				min=n;
				max_index=i;
			}
		}
		int n=a[max_index];
		a[max_index]=a[min_index];
		a[min_index]=n;
		for (int i=0;i<=a.length-1 ;i++ )
		{
			int m=a[i];
			System.out.println(m);
		}
		
	}
}
