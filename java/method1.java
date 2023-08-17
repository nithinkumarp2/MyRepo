class method1 
{
	int add(int a,int b)
	{
		return a+b;
	}
	double area_circle(double r)
	{
		return 3.14*r*r;
	}
	String disp()
	{
		return "welcome to java method";
	}
	public static void main(String args[])
	{
		method1 m=new method1();
		int x=m.add(10,20);
		double y=m.area_circle(3.65);
		String z=m.disp();
		System.out.println(z);
		System.out.println("addition"+x);
		System.out.println("area of circle:"+y);

	}
}
