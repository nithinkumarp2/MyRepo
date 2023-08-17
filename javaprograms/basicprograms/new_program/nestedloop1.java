class nestedloop1 
{
	public static void main(String[] args) 
	{
		for (int i=3;i>=1 ;i-- )
		{
				if (i%2==0)
			{
			for (int j=1;j<=3 ;j++ )
				{
					
					System.out.println(""+i+j);
				}
			}
					else
				{
						for(int j=3;j>=1;j--)
						System.out.println(""+i+j);
						
			}
		}
		 
	}

}
