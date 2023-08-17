class avg_index_in_array 
{
	public static void main(String[] args) 
	{
		int []a={1,2,3,4};
		int n=a.length-1;
		int total_index=0;
		int avg=0;
		for (int i=0;i<=n ;i++ )
		{
			total_index +=i;
			avg=total_index /  n;
		}
		System.out.println(avg+""+total_index);
	}
}
