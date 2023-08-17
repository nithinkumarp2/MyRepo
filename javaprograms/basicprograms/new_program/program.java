import java.util.Scanner;
class program 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n value");
		int n=sc.nextInt();
	 //int n=10;
	 if((n%5==0)&&(n%3==0)) 
		{
		 System.out.println("both are divisible by 5 and 3");
		}
		else if (n%5==0)
		{
			System.out.println("divisible by 5");

		}
		else if (n%3==0)
		{
			System.out.println("divisible by 3");
		}
		else gif (n<0)
		{
			System.out.println("negtive");
		}
		else 
		{
			System.out.println("invalid input");
		}
	}
}
