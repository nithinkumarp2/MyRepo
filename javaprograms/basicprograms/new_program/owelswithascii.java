class owelswithascii 
{
	public static void main(String[] args) 
	{   
		int n=65;
		for (char c='A';c<='Z' ;c++ )
		{
			if (c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
			{
				System.out.println(n+""+c);
			}
		}
		System.out.println("Hello World!");
	}
}
