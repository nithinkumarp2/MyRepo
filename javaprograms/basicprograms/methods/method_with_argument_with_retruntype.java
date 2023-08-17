class method_with_argument_with_retruntype 
{
//strong number
public static int strong(int n)
{
	int n1=n;
       int sum=0;
	   while (n>0)
	   {
		   int digit=n%10;  
		   int fact=1;
		   for (int i=1;i<=digit ;i++ )
		   { 
			   fact*=i;
		   }
		   sum+=fact;
		   n/=10;
	   }
	   if (sum==n1)
	   {
		   System.out.println(" the given number is strong number");
	   }
	   else
	{
		   System.out.println(" the given number is not a stron number");
	}
	return n1;
	}

// maximum occured characters in a string

    public String maxi(String str)
	{
		char ch=str.charAt(0);
		int n=str.length()-1;
		int count=0;
		for (int i=0;i<=n ;i++ )
		{
			char ch1=str.charAt(i);
			int count1=0;
			for (int j=0;j<=n ;j++ )
			{
				char ch2=str.charAt(j);
				if (ch1==ch2)
				{
					count1++;
				}
			}
			if (count<count1)
			{
				ch=ch1;
				count=count1;
			}
			
		}
		System.out.println(ch);	
		return str;
	}

//replace the given character in a string

   public static char replace(String str)
	{
	   char c='i';
	   char c1='k';
	   String str1="";
	   int n=str.length()-1;
	   for (int i=0;i<=n ;i++ )
	   {
		   char ch=str.charAt(i);
		   if (ch==c)
		   {
			   str1=str1+c1;
		   }
		   else
		   {
			   str1=str1+ch;
		   }
	   }
	   System.out.println(str1);	
	   return c;
	}

//convert upper to lowercase character in a string

  public static double upper_to_lower(String str)
	{
	  String str1="";
	  int n=str.length()-1;
	  for (int i=0;i<=n ;i++ )
	  {
		  char ch=str.charAt(i);
		  if (ch>=65&&ch<=90)
		  {
			  ch+=32;
			  str1=str1+ch;
		  }
		  else
		  {
			  str1=str1+ch;
		  }
		 
	  }
	   System.out.println(str1);	
	   return 1.2; 
	}

//convert lowercase to uppercase characters in a string

  public static boolean lower_to_upper(String str)
	{
	  String str1="";
	  int n=str.length()-1;
	  for (int i=0;i<=n ;i++ )
	  {
		  char ch=str.charAt(i);
		  if (ch>=97&&ch<=122)
		  {
			  ch-=32;
			  str1=str1+ch;
		  }
		 else
		  {
			  str1=str1+ch;
		  }
		 
	  }
	   System.out.println(str1);	
	   return true; 
	}

//count  number of characters int a string

        public static void count_char(String str)
	{
			int n=str.length()-1;
			int count=0;
			for (int i=0;i<=n ;i++ )
			{
				char ch=str.charAt(i);
				if (ch>=65&&ch<=90||ch>=97&&ch<=122)
				{
					count++;
				}

			}
			System.out.println(count);
			return ;
	}



	public static void main(String[] args) 
	{
		strong(145);
		System.out.println(strong(143));
		
		 method_with_argument_with_retruntype rv=new  method_with_argument_with_retruntype();
		System.out.println(rv.maxi("nithin   iii"));
		
		replace("nithin");

          // upper_to_lower("Nithin KUMar");
		    System.out.println(upper_to_lower("nithin KUMar"));	

                 System.out.println(lower_to_upper("nithin KUMar"));
				 
				 count_char("nithin123 ");
	}
}
