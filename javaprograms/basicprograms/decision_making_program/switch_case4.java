//write a program to print weekday and weekend if you enter the day numberas 1 to 5 and the
//if you enter 6 and 7 as weekend.
import java.util.Scanner;
class switch_case4 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter day number");
		int dNumber=sc.nextInt();
		switch (dNumber)
		{
		case 1:System.out.println("weekday");break;
		case 2:System.out.println("weekday");break;
		case 3:System.out.println("weekday");break;
		case 4:System.out.println("weekday");break;
		case 5:System.out.println("weekday");break;
		case 6:System.out.println("weekend");break;
		case 7:System.out.println("weekend");break;
		default:System.out.println("invalid input");
		}
	}
}
