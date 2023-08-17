class sum_digit_prime_or_not 
{
	public static void main(String[] args) 
	{
		int n=123845,sum=0;boolean res=false;
		while (n>0)
		{
			int digit=n%10;
			sum+=digit;
			if (sum%digit==0)
			{
				res=true;
			}
			n/=10;
		}
			if (res)
			{
				System.out.println("not");
			}
			else
			{
				System.out.println("prime");
			}
	//			n/=10;
	//}
		System.out.println("Hello World!");
	}
}
