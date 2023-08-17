//write a program for the below requirements
//1) create non-static variable
//2) create non-static method
//3) access variable and method from main method by using first approach
class  method2
{
	  int num=10;
	 public  void display()
	{
		 System.out.println(num);
	}
	public static void main(String[] args) 
	{ 
		method2 d1=new method2();
		d1.display();
		System.out.println("Hello World!");
	}
}
