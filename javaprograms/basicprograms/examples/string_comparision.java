class string_comparision 
{
	public static void main(String[] args) 
	{
		String str="nithin";
		int n=str.length()-1;
		String str1="nithinn";
		int n1=str1.length()-1;
		String str2="";
		String str3="";
		for (int i=0;i<=n ;i++ )
		{
			char ch=str.charAt(i);
			for (int j=0;j<=n1 ;j++ )
			{
				char ch1=str1.charAt(j);

			 
			}
		}
			if (str.equals(str1))
			{
           System.out.println("two strings are equal");
		}
    	else
			{
				System.out.println("two string are not equal");
		}
		 
	}
}
