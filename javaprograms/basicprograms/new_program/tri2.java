class tri2 
{
	public static void main(String[] args) 
	{
		for (int i=1;i<=5 ;i++ )
		{
			for (int j=1;j<=5 ;j++ )
			{
				if (j==1)
				{
					System.out.print("1");
				}
				else if (i>=2&&j==2)
				{
					System.out.print("2");
				}
				else if (i>=3&&j==3)
				{
					System.out.print("3");
				}
				else if (i>=4&&j==4)
				{
					System.out.print("4");
				}
				else if (i>=5&&j==5)
				{
					System.out.print("5");
				}
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}
