//write a program to check product of natural numbers b/w m and n even or odd
class program16 
{
	public static void main(String[] args) 
	{
		int m=1;
			int n=10;
			int product=1;
			for (int i=m;i<=n ;i++ )
			{
				product=product*i;
				if(i%2==0)
				{
					System.out.println("even");
				}
				else
				{
					System.out.println("odd");
				}

			}
		System.out.println("Hello World!");
	}
}
