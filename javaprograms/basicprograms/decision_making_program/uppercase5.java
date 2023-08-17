import java.util.Scanner;
class uppercase5 
{
	public static void main(String[] args) 
	{
		//Scanner sc=new Scanner(System.in);
		//System.out.println("enter fist value");
		int m=sc.nextInt();
		//int pos=5;
		int count=0;
		for (char ch='A';ch<='Z' ;ch++ )
		{
			count++;
			if (count==pos)
			{
			System.out.println(ch+"="+pos);
			}
		}
		
	}
}
