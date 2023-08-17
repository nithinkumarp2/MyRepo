//create a non ststic method which accepts arguments as length and breadth
//caluculate area of the rectangle and perform method calling
class  rectangle
{
	public void area(int length,int breadth)
	{
		int area_of_a_rectangle=length*breadth;
		System.out.println(area_of_a_rectangle);
	}
	public static void main(String[] args) 
	{
		new rectangle().area(2,4);
		System.out.println("Hello World!");
	}
}
