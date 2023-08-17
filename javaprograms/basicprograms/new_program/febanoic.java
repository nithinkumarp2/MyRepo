class febanoic 
{
	public static void main(String[] args) 
	{
		int a=0 ,b=1;
		
		for (int i=1;i<=15 ;i++ )
		{
		int	c=a+b;
            a=b;
			b=c;
		if (i==8)
		{
			System.out.println(c);
		}
			
		}
		

		
	}
}
