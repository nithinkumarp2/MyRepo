// write a program to print summation of odd numbers between m and n at runtime
import java.util.Scanner;
class switch_case8 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter m value");
		int m=sc.nextInt();
		System.out.println("enter n value");
		int n=sc.nextInt();
		int sum=0;
		for (int i=m;i<=n ;i++ )
		{
			if(i%2!=0)
			{
				sum=sum+i;
			}
		}
		System.out.println("the summation of "+m+" and"+n+"is"+sum);

	}
}
