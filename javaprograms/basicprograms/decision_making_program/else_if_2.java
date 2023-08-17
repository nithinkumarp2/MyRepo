//write a program to print rank based on the marks
import java.util.Scanner;
class else_if_2                                                  //marks     rank
{                                                                //90-100    1st 
	public static void main(String[] args)                       //80-89     2nd
	{                                                            //70-79     3rd
		Scanner sc=new Scanner(System.in);                       //60-69     4th
		System.out.println("enter the marks");                   //35-59     5th
		int marks=sc.nextInt();                                  //0-35      congratulations
		if ((marks>=90)&&(marks<=100))
		{
           System.out.println("1st rank");
		}
		else if ((marks>=80)&&(marks<=89))
		{
			System.out.println("2nd rank");
		
		}
		else if ((marks>=70)&&(marks<=79))
		{
			System.out.println("3rd rank");
		}
		else if ((marks>=60)&&(marks<=69))
		{
			System.out.println("4th rank");
		}
		else if ((marks>=35)&&(marks<=59))
		{
			System.out.println("5th rank");

		}
		else //if ((marks>=0)&&(marks<=35))
		{
			System.out.println("congratulations you have a bright future");
		}
		//else
		//{
		//System.out.println("");
	}
}
