//write a program to print month name by reading month number
import java.util.Scanner;
class switch_case5 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter month number");
		int mNumber=sc.nextInt();
		switch(mNumber) 
		{
			case 1:System.out.println("jan");break;
			case 2:System.out.println("feb");break;
			case 3:System.out.println("march");break;
			case 4:System.out.println("april");break;
			case 5:System.out.println("may");break;
			case 6:System.out.println("jun");break;
			case 7:System.out.println("july");break;
			case 8:System.out.println("augus");break;
			case 9:System.out.println("sept");break;
			case 10:System.out.println("oct");break;
			case 11:System.out.println("nov");break;
			case 12:System.out.println("dec");break;
			default:System.out.println("invalid input");
		}
			
	}
}
