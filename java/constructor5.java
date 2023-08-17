class Test 
{

	int id;
	String name;
	static String clz="itpoint";
	Test(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	void main()
	{
	System.out.println(id+"\t"+name+"\t"+clz);
	}

	public static void main(String[] args) 
	{
		Test t1=new Test(111,"chandu");
		t1.dispaly();
		Test t2=new Test(222,"charan");
		t2.dispaly();
		Test t3=new Test(333,"chanti");
		t3.display();

	}
}

