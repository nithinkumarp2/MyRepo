class count_alphabets_digits_special_in_string 
{
	public static void main(String[] args) 
	{
		String str="nithin1234@gmail.com";
		int n=str.length()-1;
		 int  alphabets=0;
		 int digits=0;
		 int symbols=0;
		for (int i=0;i<=n ;i++ )
		{
			char ch=str.charAt(i);
			if (ch>=65&&ch<=90||ch>=97&&ch<=122)
			{
				alphabets++;
			}
				else if (ch>=48&&ch<=57)
				{
					digits++;
				}
					else
			{
						symbols++;
			}
		}
		System.out.println(alphabets);
		System.out.println(digits);
		System.out.println(symbols);
	}
}
