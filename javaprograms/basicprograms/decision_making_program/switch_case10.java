// write a program to print product of even number b/w m and n
import java.util.Scanner;
class switch_case10
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter m value");
		int m=sc.nextInt();
		System.out.println("enter n value");
		int n=sc.nextInt();
		int product=1;
		for (int i=m;i<=n ;i++ )
		{
			if (i%2==0)
			{
				product*=i;
			}
		}
System.out.println("the product of natural number b/wn m and n is"+product);
		

	}
}
