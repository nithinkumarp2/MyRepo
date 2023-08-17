import java.util.Scanner;
class evensmall 
{

	public static void main(String[] args) 
	{	
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n value");
		int n=sc.nextInt();
		int small=n;
		while(n!=0)
		{
			 int digit=n%10;
			if((n%2==0)&&(small<digit))
			{
				small=digit;
				System.out.println("even");
			}
		}

	 
	}
}
