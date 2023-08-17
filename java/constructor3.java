class ThisTest
{
	void m1()
	{
		System.out.println("instance method");
	}
  static void m2()
	{
			System.out.println("static method");
	}
	vo	id m3()
	{
	    this.m1();
		this.m2();
	}
	static void m4()
	{
		
	    m2();
	}	
	public static void main(String[] args) 
	{
		ThisTest t=new ThisTest();
		t.m3();
		m4();

	}
}
