import java.util.Scanner;
class remove_last_character_in_string 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string");
		String str1=sc.next();
		int n=str1.length()-1;
		System.out.println("length of string"+n);
		System.out.println("empty String");
		String str2="";
		for (int i=0;i<=n-1 ;i++ )
		{
			char ch=str1.charAt(i);
			str2=str2+ch;
		}
		System.out.println(str2);
	}
}
