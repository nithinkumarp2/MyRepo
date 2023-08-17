import java.util.Scanner;
class swap_1st_last_character_in_string 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String str1=sc.next();
		
		int n=str1.length()-1;
		System.out.println("string length"+n);
		System.out.println("enetr first index");
		char ch= sc.next().charAt(0);
		System.out.println("enter last index");
		char ch1= sc.next().charAt(0);
		System.out.println("enter empty string");
		String str2= "";
		str2=""+ch1;
		for (int i=1;i<=n-1 ;i++ )
		{
			char ch2=str1.charAt(i);
			str2=str2+ch2;
		}
		str2=str2+ch;
		System.out.println(str2);
	}
}
