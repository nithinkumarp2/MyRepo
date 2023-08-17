class nestedif4 
{
	public static void main(String[] args) 
	{
		int n=112;
		if (n>=80&&n<=120)
		{
			if (n>=90&&n<=95)
			{
               System.out.println("hello");
			}
			else 
			{
			if (n>=110&&n<=115)
			{
				System.out.println("hii");
			}
			//else
			//	{
			//	System.out.println(n);
			//	}
			}
		}
		
		else
		{
			if (n<80)
			{
				if (n%2==0)
				{
					System.out.println("even");
				}
				else
				{
					System.out.println("odd");
				}
			}
		}
	}
}
