class method_without_argument_without_returntype 
{
	public static void count_owels_and_conso()
	{
		String str="nithin kumar";
		int n=str.length()-1;
		int owels=0;
		int conso=0;
		for (int i=0;i<=n ;i++ )
		{
			char ch=str.charAt(i);
			if (ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U')
			{
                           owels++;
			}
			else
			{
				conso++;
			}
		}
		System.out.println("owela="+owels);
		System.out.println("conso="+conso);
	}

//count alphabets digits symbols ina string
  public static void count_alpha_digit_symbols()
	{
	  String str="nithin1234@gmail.com";
	  int n=str.length()-1;
	  int alphabet=0;
	  int digit=0;
	  int symbol=0;
	  for (int i=0;i<=n ;i++ )
	  {
		  char ch=str.charAt(i);
		  if (ch>=65&&ch<=90||ch>=97&&ch<=122)
		  {
			  alphabet++;
		  }
		  else if (ch>=48&&ch<=57)
		  {
			  digit++;
		  }
		  else
		  {
			  symbol++;
		  }
	  }
	  System.out.println("alphabet ="+alphabet);
	  System.out.println("digit ="+digit);
	  System.out.println("symbol ="+symbol);
	}

//find minmun occured character in a string
  
  public void min()
	{
	  String str="nithitn";
	  int n=str.length()-1;
	  char ch=str.charAt(0);
	  int count=0;
	  for (int i=0;i<=n ;i++ )
	  {
		  char ch1=str.charAt(i);
		  int count1=0;
		  for (int j=0;j<=n ;j++ )
		  {
			  char ch2=str.charAt(j);
			  if (ch2!=ch1)
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
	}
//strong or weak password
    public static void password()
	{
		String str="Nithin123";
		int n=str.length()-1;
		int upper=0,lower=0,digit=0,symbol=0;
		for (int i=0;i<=n ;i++ )
		{
			char ch=str.charAt(i);
			if (ch>=65&&ch<=90)
			{
				upper++;

			}
			else if (ch>=97&&ch<=122)
			{
				lower++;
			}
			else if (ch>=48&&ch<=57)
			{
				digit++;
			}
			else
			{
				symbol++;
			}
		}
		if (upper>0&&lower>0&&digit>0&&symbol>0&&n>=8)
		{
			System.out.println("strong password");
		}
		else
		{
			System.out.println("weak password");
		}
	}
//pattern
     public static void pattern()
	{
	 int n=5;
	 for (int i=0;i<=n ;i++ )
	 {
		 for (int j=0;j<=n ;j++ )
		 {
			 if (i>=j)
			 {
				 System.out.print("* ");

			 }
			 else
			 {
				 System.out.print("  ");
			 }
		 }
		 System.out.println();
	 }
	 }
//


	public static void main(String[] args) 
	{
              count_owels_and_conso();

			  count_alpha_digit_symbols();

              method_without_argument_without_returntype rv=new  method_without_argument_without_returntype ();
			  rv.min();

			  password();

			  pattern();
		System.out.println("Hello World!");
	}
}
