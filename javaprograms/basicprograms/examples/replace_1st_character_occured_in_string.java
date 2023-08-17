class replace_1st_character_occured_in_string 
{
	public static void main(String[] args) 
	{
		String str="nithin";
		int n=str.length()-1;
		String str1="";
		char c=str.charAt(0);
		for (int i=0;i<=n ;i++ )
		{
			char ch=str.charAt(i);
			if (ch==c)
			{
				str1=str1+'k';
			}
			else
			{
				str1=str1+ch;
			}
		}
		System.out.println(str1);
	}
}
