class palendrome_string 
{
	public static void main(String[] args) 
	{
		String str="nithin nihtin";
		int n=str.length()-1;
		String str1="";
		for (int i=n; i>=0;i-- )
		{
			char ch=str.charAt(i);
                str1=str1+ch;
		}
		if (str1.equals(str))
		{
			System.out.println("palendrome");
		}
		else
		{
			System.out.println("not a palendrome");
		}
		System.out.println(str1);
	}
}
