class password_using_string 
{
	public static void main(String[] args) 
	{
		String str="Nithin@123";
		int n=str.length()-1;
		int uppercase=0,lowercase=0,digit=0,symbol=0;
         for (int i=0;i<=n ;i++ )
         {
			 char ch=str.charAt(i);
			 if (ch>='a'&&ch<='z'||ch>='A'&&ch<='Z')
			 {
				 if (ch>='a'&&ch<='z')
				 {
					 lowercase++;
				 }
				 else
				 {
					 uppercase++;
				 }
			 }
			 else
			 {
				 if (ch>=48&&ch<=57)
				 {
					 digit++;
				 }
				 else
				 {
					 symbol++;
				 }
			 }
         }
		 if (uppercase>0&&lowercase>0&&digit>0&&symbol>0&&str.length()>=8)
		 {
			 System.out.println("strong password");
		 }
		 else
		{
			 System.out.println("weak password");
		}
		System.out.println("Hello World!");
	}
}
