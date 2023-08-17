class string_only_alphabet 
{
	public static void main(String[] args) 
	{
		String str=" narendramodi1234@gmail.com";
		int n=str.length()-1;
		//char c='a';
		for (int i=0;i<=n ;i++ )
		{ 
			
			if (str.charAt(i)>='a'&&str.charAt(i)<='z'||str.charAt(i)>='A'&&str.charAt(i)<='Z')
			{
               // if (str.charAt(i)>=0&&str.charAt(i)<=n)
                {
					System.out.print(str.charAt(i));
                }
			 
			}
		}
//System.out.println(str.charAt());
	}
}
