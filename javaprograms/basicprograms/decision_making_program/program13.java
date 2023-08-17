//write a program whether the given program is divisible by 5 and 7 or not
import java.util.Scanner;
class program13 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		if ((n%5==0)&&(n%7==0))
		{
			System.out.println("divisble by both 5 nad 7");
		}
		else
		{
			System.out.println("not divisble by both 5 and 7");
		}
	}
}
