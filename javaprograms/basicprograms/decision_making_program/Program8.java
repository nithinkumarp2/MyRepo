//write a program to check whether given age is eligible or not
import java.util.Scanner;
class Program8
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter age");
		int age=sc.nextInt();
		//int age=24;
		if (age>=18)
		{
			System.out.println("eligible for voting");
		
		}
		else
		{
		System.out.println("not eligible for voting");
		}
	}
}
