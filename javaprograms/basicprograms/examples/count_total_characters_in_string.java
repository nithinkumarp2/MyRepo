class count_total_characters_in_string 
{
	public static void main(String[] args) 
	{
		String str="nithin@1234 nithin";
		int n=str.length()-1;
		String str1="";
		int count=0;
		for (int i=0;i<=n ;i++ )
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
