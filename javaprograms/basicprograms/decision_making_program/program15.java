// write a program to check summation of natural numbers b/w m and n is even or odd
import java.util.Scanner;
class  program15
{
	public static void main(String[] args) 
	{Scanner sc=new Scanner(System.in);
		System.out.println("enter m value");
		int m=sc.nextInt();
		System.out.println("enter n value");
		int n=sc.nextInt();
		int sum=0;
		for (int i=m;i<=n ;i++ )
		{sum+=i;
			
			if (i%2==0)
			{
				System.out.println("even");
			}
			else
			{
				System.out.println("odd");
			}
		}
System.out.println("the summation of natural number b/wn m and n is"+sum);
		

	}
}
