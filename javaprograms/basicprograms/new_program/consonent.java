class consonent 
{
	public static void main(String[] args) 
	{ 
		char c='a';
		int n=c;
		if ((c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U'))
		{
			System.out.println(n+ "is not a consonent");
		}
		else 
		{	
		if ((c>='a'&&c<='z')||(c>='A'&&c<='Z'))
		{
			System.out.println(c+ "  is a consonent");
		}
		}
//	System.out.println(c);
	}
}
