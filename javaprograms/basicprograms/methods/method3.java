//write a program for the below requirements
//1) create non-static variable
//2) create non-static method
//3) non-static method will print non-static variable
//4) create main method
//5) main method will call non-static method.
class  method3
{
	  int num=10;
	 public  void display()
	{
		 System.out.println(num);
	}
	public static void main(String[] args) 
	{ 
		new method3().display();
		System.out.println("Hello World!");
	}
}
