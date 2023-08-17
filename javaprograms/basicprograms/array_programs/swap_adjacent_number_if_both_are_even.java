class swap_adjacent_number_if_both_are_even 
{
	public static void main(String[] args) 
	{
		int a[]={4,6,8,13,15,17,22,18};
		int n=a.length-1;
		for (int i=1;i<=n ;i=i+2 )
		{
			//int m=a[i];
			if (a[i]%2==0)
			{
				int ele=a[i];
				a[i]=a[i-1];
				a[i-1]=ele;
			}
		}
		for (int i=0;i<=n ;i++ )
		{
           System.out.print(a[i]+" ");
		}
		
	}
}
