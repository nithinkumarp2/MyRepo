class palondrom 
{
	public static void main(String[] args) 
	{
		int n=545; int rev=0, n1=n;
		while (n>0)
		{
			int last=n%10;
			rev=rev*10+last;
			n/=10;
		}
		if (rev==n1)
		{
			System.out.println("the given number is palondrom");
		}
			else
		{
		System.out.println("the given number is not a palondrom"+n);
		}
	}
}
