class toggle_string 
{
	public static void main(String[] args) 
	{
		String str="nithin kumar";
		int n=str.length()-1;
		String str1="";
		for (int i=0;i<=n ;i++ )
		{
			char ch=str.charAt(i);
			if (i%2!=0&&i!=0)
			{

			
			if (ch>='a'&&ch<='z'||ch>='A'&&ch<='Z')
			{
				if (ch>='a'&&ch<='z')
				{
					str1=str1+ch;
				}
				else
				{
					ch+=32;
					str1=str1+ch;
				}
			}
				else
				{
					str1=str1+ch;
				}
			
			}
			
				else if (ch>='A'&&ch<='Z'||ch>='a'&&ch<='z') 
			{	
				if (ch>='A'&&ch<='Z')
				{
					str1=str1+ch;
				}
				else
				{
					ch-=32;
					str1=str1+ch;

				}
			}
			
			else
			{
				str1=str1+ch;
			}
		}
		
		System.out.println(str1);
	}
}
