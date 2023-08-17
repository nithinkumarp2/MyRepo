import java.util.Scanner;
class nowel 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter n character");
		 char n= sc.next().charAt(0);
		 int c=n;
		 if ((n=='a'||n=='e'||n=='i'||n=='o'||n=='u'||n=='A'||n=='E'||n=='I'||n=='O'||n=='U'))
		{
		 if (n%2==0)
		 {
			 System.out.println("even "+"=" +c);
		 }
		 else
		{
			 System.out.println("odd " +"="+c);
		}
		}
		else
		{
			if((n>='a'&&n<='z')||(n>='A'&&n<='Z'))
			{
		
				System.out.println(n+ " is not a ovel");
			}
		}
	}
}
