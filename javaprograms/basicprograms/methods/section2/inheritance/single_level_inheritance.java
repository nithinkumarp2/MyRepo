class A 
{
	int a;
}
class B extends A
{
}
class single_level_inheritance 
{
	public static void main(String[] args) 
	{
		B b1=new B();

		System.out.println(b1.a=40);
	}
}
