import java.util.Scanner;
class nestedif 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter m value");
		int m=sc.nextInt();
		if(m>10)
		{
			if (m%2==0)
			{
				System.out.println("given number is even number"+m);
			}
			else 
			{
				System.out.println("given number is odd number"+m);
			}
		}
			else
			{
				if (m>0)
				{
					System.out.println("given number is positive"+m);
				}
				else 
				{
					System.out.println("given number is negative"+m);
				}
			
		}
	}
}
