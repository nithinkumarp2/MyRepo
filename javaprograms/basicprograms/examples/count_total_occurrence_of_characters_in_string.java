class count_total_occurrence_of_characters_in_string 
{
	public static void main(String[] args) 
	{
		String str="nithin kumar   nithin kumar";
		int n=str.length()-1;
		String str1="";
		int count=0;
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
		System.out.println(str1);

		for (int j=0;j<=str1.length()-1 ;j++ )
		{
			char ch2=str1.charAt(j);
			int count1=0;
			for (int k=0;k<=n ;k++ )
			{
				char ch3=str.charAt(k);
				if (ch2==ch3)
				{
					count1++;

				}
			}
			if (count1>1)
		{
				
			count=count+count1;
			System.out.println("the character "+ch2+" count is"+count1);
		}
		
		}
		System.out.println(count);

	}
}
