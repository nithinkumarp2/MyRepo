//wap to create a static method which access of arguments of int
//check whether variable is even or odd
class  even_or_odd
{
	public static void m1(int n)
	{
		if (n%2==0)
		{
			System.out.println("even");
		}
		else
		{
			System.out.println("odd");
		}
	}
	public static void main(String[] args) 
	{
		m1(29);
		m1(20);
		m1(110);
		m1(180);
		System.out.println("Hello World!");
	}
}
