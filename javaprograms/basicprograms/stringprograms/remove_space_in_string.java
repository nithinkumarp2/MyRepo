import java.util.Scanner;
class remove_space_in_string 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		 System.out.println("enter string");
	 String str=sc.nextLine();
//String str="hai i am nithin";
		 int n=str.length()-1;
		 System.out.println("string length"+n);
	String str1="";
	for (int i=0;i<=n ;i++ )
	{
		char ch=str.charAt(i);
               if (ch!=' ')
               {
				   str1=str1+ch;
               }
	}

		 
		System.out.println(str1);
	}
}
