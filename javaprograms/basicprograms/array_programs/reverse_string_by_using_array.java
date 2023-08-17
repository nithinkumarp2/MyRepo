class reverse_string_by_using_array 
{
	public static void main(String[] args) 
	{
		String str="hello good morning";
		String [] ch=str.split(" ");
		int n=ch.length-1;
		String str1="";
		for (int i=0;i<=n ;i++ )
		{
			String ch1=ch[i];
			String rev="";
			for (int j=0;j<=ch1.length()-1 ;j++ )
			{
               rev=ch1.charAt(j)+rev+" ";
			}
			str1=str1+rev;
		}
		System.out.println(str1);
	}
}
