//inheritance is used to derive from one cLass to another clasS 
//clasS which derived from a clasS is known as parentclass/ superclass
//clasS ehich is derived to clasS is known as childclasS/subclass
//inheritance is used by extend keyword
class A 
{
	static int b=20;
	int a;
}
class B extends A
{

public void m1()
	{
	System.out.println(a);
	}
}
class mainclass
{

	public static void main(String[] args) 
	{
		B b1=new B();
        System.out.println(b1.b);
		System.out.println(b1.a=10 );
		b1.m1();
	}
}
