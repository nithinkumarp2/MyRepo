class find_last_character_occured_in_string 
{
	public static void main(String[] args) 
	{
		String str="nithinkumarrrrrrrr";
		int n=str.length()-1;
		char c=str.charAt(n);
		int count=0;
		for (int  i=0;i<=n ;i++ )
		{
			char ch=str.charAt(i);
			if (ch==c)
			{
				count++;
			}
		}
		System.out.println(count);
	}
}
