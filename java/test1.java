class ThisTest
{
	int a=100,b=200;
	void display(int a,int b)
	{
		System.out.println(a);
System.out.println(b);
System.out.println(this.a);
System.out.println(this.b);
}
public static void main(String []args)
	{
	ThisTest t=new ThisTest();
	t.display(10,20);
	}
}


