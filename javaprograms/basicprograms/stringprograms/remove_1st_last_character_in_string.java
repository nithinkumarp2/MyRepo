class remove_1st_last_character_in_string 
{
	public static void main(String[] args) 
	{
		String str="nithin";
		int n=str.length()-1;
		String str1="";
		//char ch=str1.charAt(0);
		for (int i=1;i<=n-1 ;i++ )
		{
			char ch=str.charAt(i);
			str1=str1+ch;
		}
		System.out.println(str1);
	}
}
