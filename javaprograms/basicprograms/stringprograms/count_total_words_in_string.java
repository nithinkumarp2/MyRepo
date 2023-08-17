import java.util.Scanner;
class count_total_words_in_string 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string");
		String str=sc.nextLine();
	//	String str="hai i am nithin";
		int n=str.length()-1;
		System.out.println("string length"+n);
		String str1="";
		int count=0, count1=1;
		for (int i=0;i<=n ;i++ )
		{
			char ch=str.charAt(i);
			if (ch!=' ')
			{
				//count++;
				str1=str1+ch;
			}
			else
			{
                 count1++;
				
			}
                         
		}
		System.out.println(str1+"="+count1  );
	}
}
