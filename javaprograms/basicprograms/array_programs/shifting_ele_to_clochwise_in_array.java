class shifting_ele_to_clochwise_in_array 
{
	public static void main(String[] args) 
	{
		int[] a={1,8,39,32,8,35,4,38,41};
		int n=0;
		for (int i=0;i<=n ;i++ )
		{
			int n1=a.length-1;
			System.out.println(n1+"lenth");
			for (int j=1; j<=n1; j++)
			{
				int ele=a[j];
				a[j]=a[j-1];
				a[j-1]=ele;
			}
			
		}
		for (int i=0;i<=a.length-1 ;i++ )
		{
			System.out.println(a[i]);
			}
	}
}
