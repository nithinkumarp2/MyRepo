class A
{
	int a=20;
}
class B extends A
{
	int b=30;
}
class C extends B
{
	int c=40;
}
class mutli_level_inheritance 
{
	public static void main(String[] args) 
	{
		C c1=new C();

		System.out.println(c1.c);
	}
}
