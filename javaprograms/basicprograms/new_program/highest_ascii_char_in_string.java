 class highest_ascii_char_in_string 
{
	public static void main(String[] args) 
	{
		String str="nithin";
	//	String str1="";
		char c=str.charAt(0);
		int n=str.length()-1;
		for (int i=0;i<=n ;i++ )
		{
			char c1=str.charAt(i);
			if (c1>c)
			{
				c=c1;
			}
		}
		System.out.println(c+""+c1);
	}
}
