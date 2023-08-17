class reverse 
{
	public static void main(String[] args) 
	{
		
		 for (int i=1;i<=5 ;i++ )
		 {
			  int n=1;
		 int m=5;
            for (int j=1;j<=5 ;j++ )
            {

				if (i+j<=5+1)
				{
					if (i%2!=0)
					{
					System.out.print(n++);
					}
				
				else if (i%2==0)
				{
					System.out.print(m-- );
				}
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
