class characters_in_string 
{
	public static void main(String[] args) 
	{
		String str="nithin 1234@gmail.com";
		int n=str.length()-1;
		String str1="";
		for (int i=0; i<=n;i++ )
		{
			char ch=str.charAt(i);
			if (ch==65&&ch==90||ch==97&&ch==122)
			{
				str1=str+ch;
			}
		}
		System.out.print(str1);
	}
}
