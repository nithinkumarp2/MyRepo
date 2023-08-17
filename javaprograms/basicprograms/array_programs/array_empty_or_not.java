class array_empty_or_not 
{
	public static void main(String[] args) 
	{
		int[] a={1};
		for (int i=0;i<a.length ;i++ )
		{
			int n=a[i];
			if (n==i)
			{
				System.out.println("empty");
			}
			else
			{
				System.out.println("not a empty");
			}
		}
		System.out.println("Hello World!");
	}
}
