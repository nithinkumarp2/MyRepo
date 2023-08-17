//write a program to check summaton of natural numbers between m and n is even or odd
class  switch_case7
{
	public static void main(String[] args) 
	{
		int m=1;
		int n=10;
		int sum=0;
		for(int i=m;i<=n ;i++ )
		{
			sum+=i;
			System.out.println("summation is "+sum);
			if (sum%2==0)
			{
				System.out.println("even number");

			}
			else 
			{
				System.out.println("odd numbers");
			}
		}
	}
}
