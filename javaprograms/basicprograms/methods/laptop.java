//wap to create a class laptop
// 1) create 2 non static methods that is color,price
//2) create 2 static methods with name and camera
//3) create a variable inside all the methods and print the variable
//call all the 4 methods
class laptop 
{
	public void color()
	{
		String str="this is red color";
		System.out.println(str);
	}
public void price()
	{
		int n=123;
		System.out.println(n);
	}
	public static void name()
	{
		String str1="my name is nithin";
		System.out.println(str1);
	}
	public  static void camera()
	{
		String str2="this is red camera";
		System.out.println(str2);
	}
	public static void main(String[] args) 
	{
		laptop rv=new laptop();
		rv.color();
		rv.price();
		name();
		camera();
		System.out.println("Hello World!");
	}
}
