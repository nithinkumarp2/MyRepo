class sum_of_even_index_in_array 
{
	public static void main(String[] args) 
	{
		int[]a={1,2,3,4,5};
		int index_value=0;
		for (int i=0;i<a.length ;i++ )
		{
			if (i%2==0)
			{
                index_value +=i;
			}
		}
		System.out.println(index_value);
	}
}
