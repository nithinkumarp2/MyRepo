class string_palondrom 
{
	public static void main(String[] args) 
	{
		String str="nithin";
		String str1="";
		int n=str.length()-1;
		for (int i=0;i<=n ;i++ )
		{
			char c =str.charAt(i);
			str1=c+str1;
		}
		if (str1.equals(str))
		{
			System.out.println("palondrom");
		}
		else
		{
			System.out.println("not a palondrom");
		}
	}
}
