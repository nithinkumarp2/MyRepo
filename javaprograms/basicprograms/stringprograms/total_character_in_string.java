class total_character_in_string 
{
	public static void main(String[] args) 
	{
		String str="nithin123";
		int n=str.length()-1;
		//String str="";
		int count=0;
		for (int i=0; i<=n;i++ )
		{
			char ch=str.charAt(i);
			 
			if (ch>='a'&&ch<='z'||ch>='A'&&ch<='Z')
			{
				count++;
				 
			}
		}
		System.out.println(count);
	}
}
