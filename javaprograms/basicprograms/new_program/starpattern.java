class  starpattern
{
	public static void main(String[] args) 
	{ int n=5;
		for (int i=1;i<=5 ;i++ )
		{
			for (int j=1;j<5 ;j++ )
			{
				if (i+j>=n+1)
				{
					System.out.print("1 ");
				}
				else
				{
					System.out.print("  ");
				}
			}
				for (int j=1;j<=5 ;j++ )
				{
					if(i>=j)
					{
					System.out.print("1 ");
					}
					else
					{
						System.out.print("  ");
					}
				}
				System.out.println();
		}

				for (int i=1;i<=4 ;i++ )
		{
			for (int j=1;j<=4 ;j++ )
			{
				if (i<j)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
				for (int j=1;j<=4 ;j++ )
				{
					if(i+j<n+1)
					{
					System.out.print("* ");
					}
					else
					{
						System.out.print("  ");
					}
				}

				System.out.println();
			}
			
		
		 
	}
}
