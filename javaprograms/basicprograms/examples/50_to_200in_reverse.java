class 50_to_200in_reverse 
{
	public static void main(String[] args) 
	{
		int rev=0;
		for (int i=50;i<=200 ;i++ )
		{
			while (i>0)
			{
				int digit=i%10;
				rev=rev*10+digit;
			}
		}
		System.out.println(rev);
	}
}
