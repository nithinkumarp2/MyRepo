import java.util.Scanner;
class upper_case_lower_case_in_string 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string");
		String str=sc.next();
		int n=str.length()-1;
		System.out.println("string length"+n);
		System.out.println("empty string");
		String str1="";
		for (int i=0;i<=n ;i++ )
		{
			char ch=str.charAt(i);
			if (ch>='A'&&ch<='Z')
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
	}
}
