class  nestedforloop
{
	public static void main(String[] args) 
	{
		int[]a={8,4,5,7,21,33,9};
		int n=a.length-1;
		for (int i=0;i<=n ;i++ )
		{
			for (int j=i;j<=n ;j++ )
			{
				System.out.println(a[j]+" ");
			}
		}
		System.out.println("Hello World!");
	}
}
