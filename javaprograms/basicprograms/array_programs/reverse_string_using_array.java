class reverse_string_using_array 
{
	public static void main(String[] args) 
	{
		String str="raja";
		char[] ch=str.toCharArray();
		int n=ch.length-1;
		String str1="";
		//char[] str1=new char[n+1]; 
		for (int i=0;i<=n ;i++ )
		{
			char s=ch[i];
			for (int j=0;j<=n-1 ;j++ )
			{
				if(ch[j]>ch[j+1])
				{
				char ele=ch[j];
				ch[j]=ch[j+1];
				ch[j+1]=ele;
			}
			//str1=ch;
			
			}
			str1=str1+ch[i];
		//System.out.println(ch);
		}

		System.out.println(str1);
	}
}
