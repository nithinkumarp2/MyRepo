//write a program to print seasions by using month number
import java.util.Scanner;
class switch_case6 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter month number");
		int mNumber=sc.nextInt();
		switch(mNumber) 
		{
			case 1:System.out.println("winter seasion");break;
				case 2:System.out.println("winter seasion");break;
			case 3:System.out.println("winter seasion");break;
			case 4:System.out.println("summer seasion");break;
			case 5:System.out.println("summer seasion");break;
			case 6:System.out.println("summer seasion");break;
			case 7:System.out.println("rainy seasion");break;
			case 8:System.out.println("rainy seasion");break;
			case 9:System.out.println("rainy seasion");break;
			case 10:System.out.println("monsoon seasion");break;
			case 11:System.out.println("monsoon seasion");break;
			case 12:System.out.println("monsoon seasion");break;
			default:System.out.println("invalid input");
		}
	}
}
