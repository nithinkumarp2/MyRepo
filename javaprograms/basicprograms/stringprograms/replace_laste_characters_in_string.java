class replace_laste_characters_in_string 
{
	public static void main(String[] args) 
	{
		String str="nithin kumar";
		int n=str.length()-1;
		String str1="";
		char ch=str.charAt(n);
		for (int i=0;i<=n ;i++ )
		{
			char ch1=str.charAt(i);
			if (ch==ch1)
			{
				str1=str1+'m';
			}
			else
			{
				str1=str1+ch1;
			}
		}
		System.out.println(str1);
	}
}
