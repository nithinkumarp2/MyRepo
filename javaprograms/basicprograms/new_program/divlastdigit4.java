class divlastdigit4 
{
	public static void main(String[] args) 
	{ 
		for (int i=1;i<=200 ;i++ )
		{
			int digit=i%10;
			if(digit%4==0)
			{
				
				System.out.println(i);
			}
		}
		//System.out.println("Hello World!");
	}
}
