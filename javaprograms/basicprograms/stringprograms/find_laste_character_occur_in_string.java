
 import java.util.Scanner;
class find_laste_character_occur_in_string 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string");
		String str=sc.next();
		int n=str.length()-1;
		System.out.println("string length"+n);
	//	System.out.println("enter laste character");
	//	char ch=sc.next().charAt(0);
	char ch=str.charAt(n);
		int count=0;
		 
		String str1="";
		for (int i=0;i<=n ;i++ )
		{
			char ch1=str.charAt(i);
			if (ch==ch1)
			{
				count++;

			}

				str1=str1+ch1;
		}
		System.out.println(count);
	}
}
