class dublicate_characters_in_string 
{
	public static void main(String[] args) 
	{
		String str="nithin kumarnithinmkuaemsgggg ";
		int n=str.length()-1;
		String str1="";
		String str2="";
		for (int i=0;i<n ;i++ )
		{
			char ch=str.charAt(i);
			int n1=str1.length()-1;
			boolean res=false;
			
			for (int j=0;j<=n1 ;j++ )
			{
				char ch1=str1.charAt(j);
				if (ch==ch1)
				{
					res=true;
					str2=str2+ch1;

				}
			}
			if (res==false)
			{
				str1=str1+ch;
			}
		}
		System.out.println(str1+"="+str2);
	}
}
