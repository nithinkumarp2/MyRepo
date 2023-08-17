class program4 
{
	public static void main(String[] args) 
	{
		char c='a';
		if ((c>='A'&&c<='Z')||(c>='a'&&c<='z'))
		{
			System.out.println("albhabet");
		}
		else if (c>=10&&c<=10)
		{
          System.out.println("digit");
		}
		else
		{
			System.out.println("special");
		}
	}
}
