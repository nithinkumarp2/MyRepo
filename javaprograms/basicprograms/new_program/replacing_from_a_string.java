class replacing_from_a_string 
{
	public static void main(String[] args) 
	{
		String str="nithin";
		String str1="";
		char c='i';
		//char ch=str1.charAt(0);
		int n=str.length()-1;
		for (int i=0;i<=n ;i++ )
		{
			char ch1=str.charAt(i);
			if (c==ch1)
			{
				str1=str1+"_";
			}
			else
			{
				str1=str1+ch1;
			}
		}
		System.out.println(str1);
		 
	}
}
