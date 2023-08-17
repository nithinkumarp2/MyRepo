class dublicate_in_string 
{
	public static void main(String[] args) 
	{
		String str="vamshi krishna";
		int n=str.length()-1;
		String str1="";
		for (int i=0;i<=n ;i++ )
		{
			char ch=str.charAt(i);
			boolean res=false;
			int n1=str1.length()-1;
			for (int j=0;j<=n1 ;j++ )
			{
				char ch1=str1.charAt(j);
				if (ch==ch1)
				{
					res=true;
				}
			}
			if (res==false)
			{
				str1=str1+ch;
			}
		}
		int count=0;
		String str2="";
		for (int i=0;i<=str1.length()-1 ;i++ )
		{
			char ch2=str1.charAt(i);
			int count1=0;
			for (int j=0;j<=n ;j++ )
			{
				char ch3=str.charAt(j);
                 if (ch2==ch3)
                 {
					 count++;
                 }
			}
			if (count>count1)
			{
				count1=count;
				count1-=1;
				//str2=str2+ch2;
                  		System.out.println(str1+"  "+ch2+"  "+count1);

			}
		}
	}
}
