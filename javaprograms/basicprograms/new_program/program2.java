import java.util.Scanner;
class program1
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter m value");
		int m=sc.nextInt();
		int smallest=m;
		while (m!=0)
		{
			int digit=m%10;
			//if (small>digit)
			{
			//	small=digit;
			}
			m=m/10;
			if (m%2==0)
			{
				System.out.println(m);
			}
		}
	}
}