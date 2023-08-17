//write a program for the below requirements
//1) create static variable
//2) create non-static method
//3) non-static method will print static variable
//4) create main method
//5) main method will call non-static method.
class  method6
{
	 static int num=100;
	 public  void display()
	{
		 // int num=10;
		 System.out.println(num);
	}
	public static void main(String[] args) 
	{ 
		new method6().display();
		System.out.println("Hello World!");
	}
}
