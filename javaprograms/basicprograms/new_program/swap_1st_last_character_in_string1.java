class swap_1st_last_character_in_string1 
{
	public static void main(String[] args) 
	{
		String str="apple";
		int n=str.length()-1;
		char c=str.charAt(0);
		char c1=str.charAt(n);
		String str1=""+c1;
		for (int i=1;i<=n-1 ;i++ )
		{
			char ch=str.charAt(i);
			str1=str1+ch;
		}
		str1=str1+c;
		System.out.println(str1);
	}
}
