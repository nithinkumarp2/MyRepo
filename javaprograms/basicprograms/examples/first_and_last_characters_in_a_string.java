class first_and_last_characters_in_a_string 
{
	public static void main(String[] args) 
	{
		String str="nithinkumar";
		int n=str.length()-1;
		char c=str.charAt(0);
		char c1=str.charAt(n);
//		String str1="";
//		for (int i=0;i<=n ;i++ )
//		{
//			char ch=str.charAt(i);
//			if (ch==c)
//			{
//				str1=str1+ch;
//			}
//			else if (ch==c1)
//			{
////				str1=str1+ch;
	//		}
	//	}
		System.out.println(c+" "+c1);
	}
}
