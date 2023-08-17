class maxi_occured_character_in_string 
{
	public static void main(String[] args) 
	{
		String str="nithinnnniiiniiinn      iiiiii   ";
		int n=str.length()-1;
            char c=str.charAt(0);
			int count=0;
			for (int i=0; i<=n; i++)
			{
				char ch=str.charAt(i);
				int count1=0;
				for (int j=0;j<=n ;j++ )
				{
					char ch1=str.charAt(j);
					if (ch==ch1)
					{
                           count1++;
					}
				}
				if (count<count1)
				{ 
					c=ch;
					count=count1;
					
				}
			}
		System.out.println(count+"="+c);
	}
}
