class program21 
{
	public static void main(String[] args) 
	{
		int n=123456;
        int count=0;
		while(n!=10)
		{
			int lastdigit=n%10;
			count++;
			n=n/10;
		}
	
		if(count==6)
		{
		System.out.println("valid");
		}
		else
		{
			System.out.println("invalid");
		}
	}
}
