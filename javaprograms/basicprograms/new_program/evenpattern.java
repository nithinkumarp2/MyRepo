class evenpattern 
{
	public static void main(String[] args) 
	{
		int n=1;char c='A';
		 for (int i=1;i<=4 ;i++ )
		{
			for (int j=1;j<=4 ;j++ )
			{
				if (i%2!=0)
				{
					System.out.print(n++);
				}
				else
				{
					System.out.print(c++);
				}
			}
			System.out.println();
		}

	}
}
