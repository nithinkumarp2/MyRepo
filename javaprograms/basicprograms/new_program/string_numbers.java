class  string_numbers
{
	public static void main(String[] args) 
	{
		String str="waste123@!.//fellow";
		int n=str.length()-1;
		for (int i=0;i<=n ;i++ )
		{
            char c=str.charAt(i);
			if (!(c>='0' && c<='9' ||c>='a'&&c<='z'||c>='A'&&c<='Z'))
			{
				System.out.print(c);
			}
		}
		System.out.println("Hello World!");
	}
}
