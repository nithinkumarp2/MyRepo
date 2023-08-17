class B_with_parameterized_constructor
{
	int a;
	public B_with_parameterized_constructor(int a)
	{
		this.a=a;
	}
	public static void main(String[] args) 
	{
		B_with_parameterized_constructor b1=new B_with_parameterized_constructor(19);
		System.out.println(b1.a);
	}
}
