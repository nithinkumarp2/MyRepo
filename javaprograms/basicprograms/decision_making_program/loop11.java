//write the program to print the product of odd numbers b/w m and n at run time
import java.util.Scanner;
class loop11
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
			if (i%2!=0)
			{
				product*=i;
			}
			
		}
		System.out.println("the product of even number b/w m and nis:"+product); 
	}
}
