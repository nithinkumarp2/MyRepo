class print_characters_in_string 
{
	public static void main(String[] args) 
	{
		String str="nithin@1234 kumar";
		String str1="";
		int n=str.length()-1;
		for (int i=0; i<=n; i++)
		{
			char ch=str.charAt(i);
			if (ch>='a'&&ch<='z'||ch>='A'&&ch<='Z')
			{
				str1=str1+ch;
			}
		}
		System.out.println(str1);
	}
}
