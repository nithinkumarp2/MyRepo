// write a program to print product od odd number b/w 10 and 15 
class program14 
{
	public static void main(String[] args) 
	{
		int m=10;
		int n=15;
		int product=1;
		for (int i=m;i<=n ;i++ )
		{
			if(i%2!=0)
			{
				product*=i;
			}
		}
		System.out.println("the product of odd number b/w 10 to15 is:"+product);
	}
}
