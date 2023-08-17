class reversestring 
{
	public static void m1(String str)
	{
		String str1="";
		for (int i=str.length()-1;i>=0 ;i-- )
		{
			char ch=str.charAt(i);
			str1=str1+ch;
			
		}
		System.out.println(str1);
	}
	public static void main(String[] args) 
	{
		m1("nithin");
		System.out.println("Hello World!");
	}
}
