class swap_adjecent_elements_in_array 
{
	public static void main(String[] args) 
	{
		int a[]={8,9,13,81,3,51,7};
		int n=a.length-1;
		for (int i=1;i<=n ;i=i+2 )
		{
			int ele=a[i];
			a[i]=a[i-1];
			a[i-1]=ele;
		}
		for (int i=0;i<=n ;i++ )
		{
			System.out.print(a[i]+" ");
		}
		System.out.println("Hello World!");
	}
}
