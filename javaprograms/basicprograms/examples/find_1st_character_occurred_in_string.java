class find_1st_character_occurred_in_string 
{
	public static void main(String[] args) 
	{
		String str="nithinnnnnnn";
		int n=str.length()-1;
		char c=str.charAt(0);
		int count=0;
		for (int i=0;i<=n ;i++ )
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
