class min_ele_in_array 
{
	public static void main(String[] args) 
	{
		int[]a={1,2,3,4};
		int n=a.length-1;
		int min=a[0];
		for (int i=0;i<=n ;i++ )
		{
			if (min>a[i])
			{
				min=a[i];
			}
		}
		System.out.println(min);
	}
}
