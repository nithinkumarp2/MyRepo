// write a program to print summation  of product and sum of natural numbers
import java.util.Scanner;
class program17 
{
	public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);
		System.out.println("enter m value");
		int m=sc.nextInt();
		System.out.println("enter n value");
		int n=sc.nextInt();
		int sum=0;
		int product=1;
		for (int i=m;i<=n ;i++ )
		{
			sum+=i;
			product*=i;
		}
System.out.println("the sum is"+sum);
System.out.println("the sum is"+product);
System.out.println(sum+product);
	}
}
