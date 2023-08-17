class two_string_char_present 
{
	public static void main(String[] args) 
	{
		String str="naveen";
		String str1="av";
		char[] s= str.toCharArray();
        char[] s1= str1.toCharArray();

		int n=s.length-1;
		int n1=s1.length-1;
		for (int i=0;i<=n ;i++ )
		{
		//	char ch=s.charAt(i);
			for (int j=0;j<=n1 ;j++ )
			{
		//		char ch1=s1.charAt(j);
				//for (int k=0;k<=n1 ;k++ )
				{
					if (s[i]==s1[j])
					{
						System.out.println("yes "+s[i]+"="+s1[j]);
					}
					else
					{
						System.out.println("no "+s[i]+"="+s1[j]);
					}
				}
			}
		}
		System.out.println("Hello World!");
	}
}
