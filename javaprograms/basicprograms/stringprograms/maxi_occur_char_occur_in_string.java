class maxi_occur_char_occur_in_string 
{
	public static void main(String[] args) 
	{ 
		 String str="nithikaumarnnaaa iiiiiiiiiiiii                          ";
		 int n=str.length()-1;		 
		 
		 char ch=str.charAt(0);
		  char c=str.charAt(0);
		 int count=0;
		 for (int i=0;i<=n ;i++ )
		 {
			 char ch1=str.charAt(i);
			 int count1=0;
				  for (int j=0;j<=n ;j++ )
				  {
					  char ch2=str.charAt(j);
					  if (ch1==ch2  )
					  {
						 count1++;
						 c=ch2;
					  }
				  }
				 if (count<count1)
				 {
					 ch=ch1;
					 count=count1;
					 System.out.println(ch+" "+count+""+c);
				 }
				  
			 }
		// System.out.println(ch+"="+count );
	}
}
