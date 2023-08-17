class nestedloop 
{
	public static void main(String[] args) 
	{
		
		for (int i=1;i<=8 ;i++ )
		{
			
          if (i%2!=0)
          {
			  int count=0;
			  for (int j=i+1;j<=8 ;j++ )
			  {
				  if (j%2==0&&count<1)
				  {
					  System.out.println(""+i+j+j+i);
					  count++;
				  }
			  }
          }
		}
		//System.out.println("Hello World!");
	}
}
