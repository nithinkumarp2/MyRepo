class reverse_letters_in_string 
{
	public static void main(String[] args) 
	{
		String str="nithin";
		int n=str.length()-1;
		String str1="";
		for (int i=0;i<=n ;i++ )
		{
			char ch=str.charAt(i);
			str1=ch+str1;
		}
		System.out.println(str1);
	}
}
