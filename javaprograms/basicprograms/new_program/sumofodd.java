class sumofodd 
{
	public static void main(String[] args) 
	{
		int sum=0;
		for (int i=1;i<=100 ;i++ )
		{
			sum +=i;
			if (sum%2!=0)
			{
				System.out.println(sum);
			}
			
		}
		
	}
}
