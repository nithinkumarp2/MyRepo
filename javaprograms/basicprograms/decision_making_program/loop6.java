import java.util.Scanner;
class loop6 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the m value");
		int m=sc.nextInt();
		System.out.println("enter the n value");
		int n=sc.nextInt();
		for (int i=m;i<=n ;i++ )
		{
			if (i%2!=0)
			{
				System.out.println(i); 
			}
		}
	}
}
