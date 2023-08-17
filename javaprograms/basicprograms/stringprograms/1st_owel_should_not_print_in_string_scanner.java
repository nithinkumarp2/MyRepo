import java.util.Scanner;
class first_owel_should_not_print_in_string_scanner
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter String");
		String str=sc.next();
		int n=str.length()-1;
		System.out.println("string length"+n);
		for (int i=0; i<=n;i++ )
		{
			char ch=str1.charAt(i);
			if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				if (ch>=2)
				{
					str1=str1+ch;

				}

			}

		}
		SYtem.out.println(str1);
	}
}
