class string_albh_digit_symbols_in_newstring 
{
	public static void main(String[] args) 
	{
		String str="nithin@12345@gmail.com";
		String alphabets="";
		String digit="";
		String symbols="";
		int n=str.length()-1;
		int count=0,count1=0,count2=0;
		for (int i=0;i<=n ;i++ )
		{
			char c=str.charAt(i);
			if (c>='a'&&c<='z'||c>='A'&&c<='Z')
			{
				alphabets=alphabets+c;
				count++;
			}
			else if (c>=48&&c<=57)
			{
				digit=digit+c;
				count1++;
			}
			else
			{
				symbols=symbols+c;
                     count2++;
			}
		}
		System.out.println("alphabets:"+alphabets+"  digit:"+digit+"  symbols:"+symbols);
		System.out.println("alphabets:"+count+" digit:"+count1+" symbols:"+count2);
	}
}
