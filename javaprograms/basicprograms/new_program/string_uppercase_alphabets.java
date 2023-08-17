class string_uppercase_alphabets 
{
	public static void main(String[] args) 
	{
		String str="NIthin KuMaR";
		int n=str.length()-1;
		for (int i=0;i<=n ;i++ )
		{
		//	if (str.charAt(i)>='A'&&str.charAt(i)<='Z')
				if (str.charAt(i)>='a'&&str.charAt(i)<='z')
			{
				System.out.print(str.charAt(i));
			}
		}
		System.out.println("Hello World!");
	}
}
