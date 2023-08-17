//write a program to print male or female based on the character m and f
import java.util.Scanner;
class program12 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the character");
			char c=sc.next().charAt(0);
		if (c=='m')
		{
			System.out.println("male");
		}
		else
		{
		System.out.println("female");
		}
	}
}
