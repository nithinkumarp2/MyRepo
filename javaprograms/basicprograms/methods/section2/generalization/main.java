class classroom
{
	int a=10;
	String s="nithin";
}
class student extends classroom
{
	public void m1(classroom c)
	{
		System.out.println(c.a);
	}
}
class student1 extends classroom
{
public void m1(classroom c)
	{
		System.out.println(c.s);
	}
}
class student2 extends classroom
{

}
class  main
{
	public static void main(String[] args) 
	{
		student s1=new student();
		student1 s2=new student1();
		student2 s3=new student2();
		s1.m1(s2);
		s2.m1(s3);
		s2.m1(s1);
		System.out.println("Hello World!");
	}
}
