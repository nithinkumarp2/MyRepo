import java.util.Scanner;
class program18 
{
	public static void main(String[] args) 
	{ 
		Scanner sc=new Scanner(System.in);
		System.out.println("enter m value");
		int m=sc.nextInt();
		System.out.println("enter n value");
		int n=sc.nextInt();
		for (int i=m;i<=n ;i++ )
		{
			if(i%2==0)
			{
				System.out.println("even"+i);
			}
		}
			for (int i=m;i<=n ;i++ )
			{
				if (i%2!=0)
				{
					System.out.println("odd"+i);
				}
			}
			//else if(i%2!=0)
			//{

			//	System.out.println("odd"+i);
			//}
		//	else
		//	{
		//		System.out.println("ivalid number");
		//	}

		}
	}

