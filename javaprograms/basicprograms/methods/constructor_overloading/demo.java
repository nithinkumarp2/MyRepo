//constructor overloaading are created by mutliple constructors with same name and differ inthere arguments is known as constructor overloading
class  demo
{
	int a;
	int b;
	demo(int a)
	{
		this.a=a;
	}
	demo(int a,int b)
	{
		this.a=a;
		this.b=b;

	}
	public void print()
	{
		System.out.println(a);
		System.out.println(b);
	}
	public static void main(String[] args) 
	{  
		demo d1=new demo(10);
		d1.print();
		System.out.println("Hello World!");
		demo d2=new demo(10,20);
		d2.print();
	}
}
