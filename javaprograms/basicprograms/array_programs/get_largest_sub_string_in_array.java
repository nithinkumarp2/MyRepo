class get_largest_sub_string_in_array 
{
	public static void main(String[] args) 
	{
		String str="i am a java developer";  String str2="";
		String[] str1=str.split(" ");
		int n=str1.length-1;
		int count=0;
		for (int i=0;i<=n ;i++ )
		{
			String s=str1[i];
			System.out.println(s);
			int n1=s.length()-1;
			int count1=0;
			for (int j=0;j<=n1 ;j++ )
			{
                   char ch=s.charAt(j);
				   count1++;
				//  System.out.println(ch);
				   if (count>count1)
			{
			 
			str2=str2+s;
			}
			//	   str2=str2+s;
				 //  System.out.println(ch+"="+count1);
	count=count1;
			}
		}

 System.out.println(str2+"="+count);
	}
}
 