interface I1
{
	void m1();
	void m2();
	void m3();
}
class A implements I1
{
	public void m1()
	{
		System.out.println("m1 is method for A");
	}
		public void m2()
	{
		System.out.println("m2 is method for A");
	}
		public void m3()
	{
		System.out.println("m3 is method for A");
	}
}
 class helper
 {
	 public static I1 m4()
	 {
		 I1 i=new A();
		 return i;
	 }
 }

class  main1
{
	public static void main(String[] args) 
	{
		I1 i= helper.m4();
	//	i.m1();
		i.m3();
		
		System.out.println("Hello World!");
	}
}
