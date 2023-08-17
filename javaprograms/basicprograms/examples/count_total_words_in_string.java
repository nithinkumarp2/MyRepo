class count_total_words_in_string 
{
	public static void main(String[] args) 
	{
		String str="i am nithin kumar";
		int n=str.length()-1;
		int count=1;
		for (int i=0;i<=n ;i++ )
		{
			char ch=str.charAt(i);
			if (ch==' ')
			{
				count++;
			}
		}
		System.out.println(count);
	}
}
