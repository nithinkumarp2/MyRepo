class remove_all_occurred_character_in_string_by_using_count 
{
	public static void main(String[] args) 
	{  
		String str="nithinkuamararraa";
		int n=str.length()-1;
		String str1="";
		int count=0;
		for (int i=0; i<=n;i++ )
		{
			char ch=str.charAt(i);
			int count1=0;
			int n1=str1.length()-1;
			for (int j=0; j<=n;j++ )
			{
				char ch1=str.charAt(j);
				if (ch==ch1)
				{
					count1++;
				}
				
			}
			//System.out.println(count1);
			if (count<count1)
			{
				ch=ch1; 
				count=count1;
				str1=str1+ch;
			}
			else
			{
				str1=str1+ch;
			}
		}
            System.out.println(str1);
	}
}
