import java.util.Scanner;
class nestedif2
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a value");
		System.out.println("enter b value");
		System.out.println("enter c value");
		System.out.println("enter d value");
		System.out.println("enter e value");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int d=sc.nextInt();
		int e=sc.nextInt();
		if (a>b)
		{
			if (a>c)
			{
				if (a>d)
				{
					if (a>e)
					{
						System.out.println("a is greater:+a");
					}
					else
					{
					   System.out.println("e is greater:+e");

					}
				}
				else
				{
					if (d>e)
					{
						System.out.println("d is greater:+d");
					}
					else
					{
						System.out.println("e is greater:+e");
					}
				}
			}
			else
			{
				if (c>d)
				{
                  if (c>e)
                  {
					  System.out.println("c is greater:+c");
                  }
				  else
					{
					  System.out.println("e is greater:+e");
					}
				}
				else
				{
					if (d>e)
					{
						System.out.println("d is greater:+d");
					}
					else
					{
						System.out.println("e is greater:+e");
					}
				}
			}
		}
		else
		{
			if (b>c)
			{
				if (b>d)
				{
					if (b>e)
					{
						System.out.println("b is greater:+b");
					}
					else
					{
						System.out.println("e is greater:+e");
					}
				}
				else
				{
					if (d>e)
					{
						System.out.println("d is greater:+d");
					}
					else
					{
						System.out.println("e is greater:+e");
					}
				}
			}
			else 
			{
				if (c>d)
				{
					if (c>e)
					{
						System.out.println("c is greater:+c");
					}
					else
					{
						System.out.println("e is greater:+e");
					}
				}
			
			else
			{
				if (d>e)
				{
					System.out.println("d is greater:+d");
				}
				else
				{
					System.out.println("e is greater:+e");
				}
			}
		}
		}
	}
}
