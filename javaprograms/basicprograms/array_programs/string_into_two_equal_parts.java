class  string_into_two_equal_parts
{
	public static void main(String[] args) 
	{
		String[] str={"abcdev"};
		 int n=str.length-1;
		 String s="";
		 for (int i=0;i<=n ;i++ )
		 {
			 String str1=str[i];
			  int n1=str1.length()-1;
			   for (int j=0;j<=n1%2 ;j++ )
		 {
				   char ch=str1.charAt(j);

		              s=s+ch;
		 }
		 	
		 }
		 System.out.println(s);
	}
	
}
