class dublicates_in_array 
{
	public static void main(String[] args) 
	{
		int []a={8,4,4,9,9,3,8,2};
		int n=a.length-1;
	//	int[]b=new int[n+1];
	for (int j=0;j<=n ;j++ )
	{
	 for (int i=0; i<=n-1; i++)
	 {
		 if (a[i]>a[i+1])
		 {
		int ele=a[i];
		a[i]=a[i+1];
		a[i+1]=ele;
		 }
	//	 System.out.println(a[i]);
	 }
	}
	int j=0;
	int b[]=new int[n+1];
	for (int i=0;i<=n-1 ;i++ )
	{
		if (a[i]!=a[i+1])
		{
			b[j++]=a[i];
			//j++;
		}
		
	}
	b[j++]=a[n];
	 for (int i=0;i<=n ;i++ )
	 {
		 if (b[i]!=0)
		 {
		 System.out.println(b[i]);
		 }
	 }
	
	}
}
