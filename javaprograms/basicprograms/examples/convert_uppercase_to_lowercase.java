class convert_uppercase_to_lowercase 
{
	public static void main(String[] args) 
	{
		String str="Nithin kumar";
		int n=str.length()-1;
		String str1="";
		for (int i=0; i<=n;i++ )
		{
			char ch=str.charAt(i);
			if (ch>='A'&&ch<='Z')
			{
				ch+=32;
				str1=str1+ch;
			}
			else
			{
				str1=str1+ch;
			}
		}
		System.out.println(str1);
	}
}
