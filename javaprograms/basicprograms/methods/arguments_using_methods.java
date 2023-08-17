//wap for below requirements
//1) create a class
//2) create static method with two arguments such as string and char
//3) create non static method with three arguments such as int,int,double
//4) print the variable inside there methods
//5) perform method

class arguments_using_methods
    
{
	public static void m1(String str,char ch)
	{ 
		System.out.println(str);
		System.out.println(ch);
	}
	public void m2(int a, int b, double d)
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(d);
	}

	public static void main(String[] args) 
	{ 
		m1("nithin",'p');
		arguments_using_methods rv=new arguments_using_methods();
		rv.m2(22,45,4.5);
		System.out.println("Hello World!");
	}
}
