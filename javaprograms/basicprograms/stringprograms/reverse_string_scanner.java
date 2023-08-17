import java.util.Scanner;
class reverse_string_scanner 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string");
		String str=sc.next();
		//String str="nithin";
         int n=str.length()-1;
         System.out.println("string length"+n);
		 System.out.println("empty string");
		 String str1="";
		 for (int i=0;i<=n ;i++ )
		 {
			 char ch=str.charAt(i);
			 str1=ch+str1;
		 }
		 System.out.println(str1);

	}
}
