//write a program for the below requirements
//1) create static variable
//2) create static method
//3) static method will print static variable
//4) create main method
//5) main method will call static method.
class  method4
{
	static  int num=10;
	 public static  void display()
	{
		 System.out.println(num);
	}
	public static void main(String[] args) 
	{ 
		display();
		System.out.println("Hello World!");
	}
}
