class count_positive_and_negative_numbers_in_array 
{
	public static void main(String[] args) 
	{
		int[] a={1,2,5,8,-5,-6,-10};int positive=0,negative=0;
		for (int i=0;i<a.length ;i++ )
		{
			int n=a[i];
			if (n>0)
			{
				positive++;
			}
            else
			{
				negative++;
			}
		}
		System.out.println("positive="+positive+" negative="+negative);
	}
}
