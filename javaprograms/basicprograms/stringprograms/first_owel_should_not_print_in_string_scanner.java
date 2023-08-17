 import java.util.Scanner;
 class first_owel_should_not_print_in_string_scanner
 {
	 public static void main(String[]args)
	 {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter string");
		 String str=sc.next();
		 int n=str.length()-1;
		  System.out.println("string length"+n);
		  System.out.println("empty string");
		  String str1="";
		  int count=0;
		  for (int i=0;i<=n ;i++ )
		  {
			  char ch=str.charAt(i);
			  if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u' )
			  {
                if(count>2)
				  {
				 count++;
				  str1=str1+ch;
				
			  }
			  }
			  else 
			  {
				   str1=str1+ch;
			  }
			  }
		  
		  System.out.println(str1);
	 }
 }