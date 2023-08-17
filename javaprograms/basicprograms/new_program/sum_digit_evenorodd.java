class sum_digit_evenorodd 
{
	public static void main(String[] args) 
	{
		int n=12345,sum=0;
		while (n>0)
		{ 
			int digit=n%10;
			sum+=digit;
			if (sum%2!=0)
			{
				System.out.println("odd"+sum);
			}
			else
			{
				System.out.println("not odd"+sum);
			}
			n/=10;
		}
		System.out.println("Hello World!");
	}
}
