import java.util.Scanner;
class nestedif1
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a value");
		int a=sc.nextInt();
		System.out.println("enter b value");
		int b=sc.nextInt();
		System.out.println("enter c value");
		int c=sc.nextInt();
		System.out.println("enter d value");
		int d=sc.nextInt();
		System.out.println("enter e value");
		int e=sc.nextInt();
        if (a<b)
        {
			if (a<c)
			{
				if (a<d)
				{
					if (a<e)
					{
						System.out.println("a iis samllest "+a);
					}
					else
					{
						System.out.println("e is smallest"+e);
					}
				}
				else
				{
					if (d<e)
					{
						System.out.println("d is smallest"+d);

					}
					else
					{
						System.out.println("e is smallest"+e);
					}
			}
        
		}
		
		else
			{
			if (c<d)
			{
				if (c<e)
				{
                      System.out.println("c is smallest"+c);
				}
				else
				{
					System.out.println("e is smallest"+e);
				}
			}
			
			else
				{
				if (d<e)
				{
					System.out.println("d is smallest"+d);
				}
				else
					{
					System.out.println("e is smallest"+e);
					}
			    }
			}
		}
		      else
		{
			if (b<c)
			{
				if (b<d)
				{
					if (b<e)
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
					if (d<e)
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
				if (c<d)
				{
					if (c<e)
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
					if (d<e)
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


