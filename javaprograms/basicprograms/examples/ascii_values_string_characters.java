class ascii_values_string_characters 
{
	public static void main(String[] args) 
	{
		String str="nithin@1234";
		int n=str.length()-1;
		String str1="";
         for (int i=0;i<=n ;i++ )
         {
			 int ch=str.charAt(i);
			 str1=str1+ch+" ";
            }

           System.out.println(str1);
	}
}
