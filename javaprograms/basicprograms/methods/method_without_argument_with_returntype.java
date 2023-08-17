class method_without_argument_with_returntype 
{
	public static void prime_number()
	{
		int n=5;
		boolean res=false;
		for (int i=2;i<n ;i++ )
		{
			
			if (n%i==0)
			{
                res=true;
			}
		}
		if (res==false)
		{
			System.out.println("the given number is a prime");

		}
		else
		{
			System.out.println("the given number is not a prime number");
		}
		return ;
	}

//reverse number


public int reverse_number()
	{
	  int n=143578;
	  int rev=0;
	  while(n>0)
	  {
		  int digit=n%10;
		  rev=rev*10+digit;
		  n/=10;
	  }
	  return rev;
	}

// number palendrome

public static char number_palendrome()
	{
	int n=123321;
	int n1=n;
	int rev=0;
	while(n>0)
		{
		int last=n%10;
		rev=rev*10+last;
		n/=10;
           
		}
		if (n1==rev)
		{
			System.out.println("the given number is a palendrome");
		}
		else
		{
			System.out.println("the given number is not a palendrome");
		}
		return 'a';
	}

	// count total occurenced character in a string  or  dublicate characters in a string

	public static String count_total_occured_character()
	{
		String str="nithin kumar nithinn kumar  ";
		int n=str.length()-1;
         String str1="";
		 int count=0;
		 for (int i=0;i<=n ;i++ )
		 {
			 char ch=str.charAt(i);
			 int n1=str1.length()-1;
			 boolean res=false;
			 for (int j=0;j<=n1 ;j++ )
			 {
				 char ch1=str1.charAt(j);
				 if (ch==ch1)
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

		 for (int j=0;j<str1.length() ;j++ )
		 {
			 char ch2=str1.charAt(j);
			 int count1=0;
			 for (int k=0;k<=n ;k++ )
			 {
				 char ch3=str.charAt(k);
				 if (ch2==ch3)
				 {
					 count1++;
				 }
			 }
			 if (count1>1)
			 {
				 count1=count1-1;
				 System.out.println("the char is "+ch2+" count of character is"+count1);
			 }
		 }
		   return str;
	}

// find all occured characters ina string

public static double count_all_occured_character()
	{
		String str="nithin kumar nithinn kumar  ";
		int n=str.length()-1;
         String str1="";
		 int count=0;
		 for (int i=0;i<=n ;i++ )
		 {
			 char ch=str.charAt(i);
			 int n1=str1.length()-1;
			 boolean res=false;
			 for (int j=0;j<=n1 ;j++ )
			 {
				 char ch1=str1.charAt(j);
				 if (ch==ch1)
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

		 for (int j=0;j<str1.length() ;j++ )
		 {
			 char ch2=str1.charAt(j);
			 int count1=0;
			 for (int k=0;k<=n ;k++ )
			 {
				 char ch3=str.charAt(k);
				 if (ch2==ch3)
				 {
					 count1++;
				 }
			 }
			 if (count1>1)
			 {
				// count1=count1-1;
				
				 System.out.println("the char is "+ch2+" count of character is"+count1);
			 }
		count=count+count1;
		 }

		 System.out.println(count);
		   return 1.2;
	}

//count words ina string
   public boolean count_words()
	{
	   String str="nithin kumar nithin kumar";
	   int n=str.length()-1;
	   int count=1;
	   for (int i=0;i<=n ;i++ )
	   {
		   char ch=str.charAt(i);
		   if (ch==' ')
		   {
			   count++;
		   }
	   }
	   System.out.println(count);
	   return true;
	}



	public static void main(String[] args) 
	{
		prime_number();

		method_without_argument_with_returntype rv=new method_without_argument_with_returntype();
		System.out.println(rv.reverse_number());

     	number_palendrome();

		System.out.println(count_total_occured_character());

        System.out.println(count_all_occured_character());

		rv.count_words();


	}
}
