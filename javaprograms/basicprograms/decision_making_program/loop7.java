//write the program to print summation of even numbers between 10 to 20 qt runtime
import java.util.Scanner;
class loop7 
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
			if (i%2==0)
			{
				sum+=i;
			}
			
		}
		System.out.println("the summation of even number b/w m and nis:"+sum); 
	}
}
