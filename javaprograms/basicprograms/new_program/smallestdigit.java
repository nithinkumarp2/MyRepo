class smallestdigit 
{
	public static void main(String[] args) 
	{
		int i=1234;
		int smallest=1;
		while (i>0)
		{
			int digit=i%10;
			if (smallest>digit)
			{
				smallest=digit;
			}
			i/=10;
		}
		System.out.println(smallest);
	}
}
