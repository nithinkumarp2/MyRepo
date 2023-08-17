// write a program to find product of natural number between m and n
import java.util.Scanner;
class switch_case9 
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
			product*=i;
System.out.println("the product of natural number b/wn m and n is"+product);
		}
		
	}
}
