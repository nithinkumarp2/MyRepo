import java.util.Scanner;
class find_1st_character_occur_in_string 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
	//	System.out.println("enter string");
	//	String str=sc.next();
	    String str="nithin kuamr nnn";
		int n=str.length()-1;
		System.out.println("string length"+n);
		
	//	char ch=sc.next().charAt(0);
	char ch=str.charAt(0);
	System.out.println("enter 1st index="+ch);
		int count=0,count1=0;
		
		String str1="";
		System.out.println("empty string"+str1);
		for (int i=0;i<=n ;i++ )
		{
			char ch1=str.charAt(i);
			if (ch==ch1)
			{
				count++;
				 count1=count-1;
			}
				str1=str1+ch1;
		}
		System.out.println(count1);
	}
}
