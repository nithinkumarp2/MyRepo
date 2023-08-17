 class count_no_of_dublicates_in_string 
{
	public static void main(String[] args) 
	{ 
		String str="nithin n 444iethin kumar";
		int n=str.length()-1;
		String str1="";
		 
		for (int i=0;i<=n ;i++ )
		{
			char ch=str.charAt(i);
			int n1=str1.length()-1;
			boolean res=false;
			for (int j=0;j<=n1 ;j++ )
			{
				char ch1=str1.charAt(j);
				if (ch1==ch)
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
                 int count1=0;
				 int a=0;
		for (int j=0;j<str1.length() ;j++ )
		{
			char ch2=str1.charAt(j);
		
			int count=0;
			 
			for (int k=0;k<=n ;k++ )
			{
				char ch3=str.charAt(k);
				if (ch2==ch3)
				{ 
					count++;
					
			//	System.out.println(ch2);
			}
				}
				
			if (count>1)
			{
				  a=count-1;
			 count1=count1+a;
				System.out.println("the char is "+ch2+" is count ="+a);
			}
			 
		}
      System.out.println(count1);  
	}
}
