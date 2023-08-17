class string_newstring 
{
	public static void main(String[] args) 
	{
		String str="nithin12345@gmail.com";
		String str1="";
		int n=str.length()-1;
		for (int i=0;i<=n ;i++ )
		{
			char c=str.charAt(i);
			if (c>='a'&&c<='z'||c>='A'&&c>='Z')
			{
				str1=str1+c;
			}
		}
		System.out.println(str1);
	}
}
