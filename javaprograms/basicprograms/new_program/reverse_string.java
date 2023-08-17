class reverse_string 
{
	public static void main(String[] args) 
	{
		String str="nithin";
		String str1="";
		int n=str.length()-1;
		for (int i=0;i<=n ;i++ )
		{ 
			char c=str.charAt(i);
			str1=c+str1;
		}
		System.out.println(str1);
	}
}
