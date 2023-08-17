class prime_digit_only 
{
	public static void main(String[] args) 
	{
		int n=123485;boolean res=false; 
		while (n>0)
		{
			int digit=n%10;
			//n/=10;
			if (digit%n==0)
			{
				res=true;
			}
		
			if (res)
			{
            System.out.println(digit);
			}
			n/=10;
		}
		System.out.println("Hello World!");
	}
}
