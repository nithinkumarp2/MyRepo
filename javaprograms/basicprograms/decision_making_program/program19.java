import java.util.Scanner;
class  
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter m character");
		char m=sc.next().charAt(0);
		System.out.println("enter n character");
		char n=sc.next().charAt(0);
		int sum=0;
		for(char ch=m;ch<=n;ch++)
		{
			if ((int)ch%2==0)
			{
				sum=sum+(int)ch;
			}
	}

}
