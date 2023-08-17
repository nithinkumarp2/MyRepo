 class largestdigit 
{
	public static void main(String[] args) 
	{
		int n=1234;
		int largest=0  ;
		while (n>0)
		{
			int digit=n%10;
			if (largest<digit)
			{
				largest=digit;
			}
			n=n/10;
		}
		System.out.println(largest);
	}
}
