class Test 
{
	int a;
	int b;
	int c;
	Test(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	Test(int a,int b,int c)
	{
		this(a,b);
		this.c=c;
	}
	public void display()
	{
		System.out.println(a);
		System.out.println(b);
        System.out.println(c);

	}
	public static void main(String[] args) 
	{
		Test t1=new Test(10,20,30);
		t1.display();
		System.out.println("Hello World!");
	}
}
