class count_owels_consonants_in_string 
{
	public static void main(String[] args) 
	{ 
		String str="nithinkumar";
		int n=str.length()-1;
		int owels=0;
		int cons=0;
		for (int i=0;i<=n ;i++ )
		{
			char ch=str.charAt(i);
			if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
			{
                   owels++;
			}
				   else
			{
					   cons++;
			}
		}

		System.out.println( "owela"+owels);
		System.out.println("consonant"+cons);
	}
}
