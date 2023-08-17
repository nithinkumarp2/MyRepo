class method_with_argument_without_retruntype 
{
	public static void amstrong(int n)
	{
		int n1=n,n2=n;
		int count=0;
		int sum=0;
		while (n>0)
		{
			n/=10;
			count++;
		}
		while (n1>0)
		{
			int digit=n1%10;
			int power=1;
			for (int i=1;i<=count ;i++ )
			{
                power*=digit;
			}
               sum+=power;
			   n1/=10;
		}
		if (sum==n2)
		{
			System.out.println("the given number is a amstrong number");
		}
		else
		{
			System.out.println("the given number is not a amstrong number");
		}
	}


//reverse a string   non-static

       public void reverse(String str)
	{
		   int n=str.length()-1;
		   String str1="";
		   for (int i=0;i<=n ;i++ )
		   {
			   char ch=str.charAt(i);
			   str1=ch+str1;
		   }
		   System.out.println(str1);
	}

//the_given_character_is_a_alphabet_or_digit_or_special_symbol-->

    public void alpha_digit_symbol(char ch)
	{
             if (ch>=65&&ch<=90||ch>=97&&ch<=122)
             {
				 System.out.println("alphabet");
             }
			 else if (ch>=48&&ch<=57)
			 {
				 System.out.println("digit");
			 }
			 else
		{
				 System.out.println("special symbold");
		}

	}


//remove dublicate characters in a string

     public static void dublicate_character(String str)
	{
          String str1="";
		  int n=str.length()-1;
		  for (int i=0; i<=n;i++ )
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
		  System.out.println(str1 );
	}

//the given number is perfect or not

  public void perfect_number(int n)
	{
	  int sum=0;
	  for (int i=1;i<=n-1 ;i++ )
	  {
		  if (n%i==0)
		  {
			  sum+=i;
		  }
	  }
	  if (sum==n)
	  {
		  System.out.println("the given number is a perfect number");
	  }
	  else
		{
		  System.out.println(" the given number is not a perfect number");

		}
	}

//count number of ovels and consonents in a string
   public static void owel(String str)
	{
	   int n=str.length()-1;
	   int owel=0,cons=0;
	   for (int i=0;i<=n ;i++ )
	   {
		   char ch=str.charAt(i);
		   if (ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U')
		   {
			 owel++;
		   }
			 else
		   {
				 cons++;
		   }
	   }
	   System.out.println("owels ="+owel);
	   System.out.println("consonent ="+cons);
	}

//febanoic series

  public void feba(int a,int b,int n)
	{
	  System.out.println(a);
	  System.out.println(b);
          for (int i=1;i<=n-2 ;i++ )
          {
			  int c=a+b;
			       a=b;
				   b=c;
				   
				    System.out.println(c );
          }
		  System.out.println("the given number is"+n);
	}




	public static void main(String[] args) 
	{
		amstrong(153);
              method_with_argument_without_retruntype rv=new method_with_argument_without_retruntype();
			  rv.reverse("nithin");
			  rv.alpha_digit_symbol('?');
			  dublicate_character("nithin nithin ");
              rv.perfect_number(6);
               owel("nithin");
               
                  rv.feba(0,1,5);

		System.out.println("Hello World!");
	}
}
