class  string_even
{
	public static void main(String[] args) 
	{
		String str="weste fellow";
		int n=str.length()-1;
		for (int i=0;i<=n ;i++ )
		{
			if (i%2==0 &&i!=0)
			{
				System.out.println(str.charAt(i));
			}
		}
		System.out.println("Hello World!");
	}
}
