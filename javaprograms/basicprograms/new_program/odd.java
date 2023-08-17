 import java.util.Scanner;
 class  odd
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter m value");
		int m=sc.nextInt();
		System.out.println("enter n value");
		int n=sc.nextInt();
	//char c='A';
	int v=1;
		for (int i=m;i<=n ;i++ )
		{
			if (i%3==0&&i%5==0)
			{
				System.out.println(i);
				System.out.println( "fizzbuzz");
				
			}
			if(i%3==0)
			{
				System.out.println(i);
				System.out.println("fizz");
			}
			else if (i%5==0)
			{
				System.out.println(i);
				System.out.println("buzz");
			}
				System.out.println(i);
		}
		
	}
}
