class  hospital 
{
	static String hName="ashoda";
	static String hCeo="ashodaCEO";
	static String hAddress="malakpet";
	String pName;
	int pId;
	String pDesease;
	String pTreatmentamount;
	public static void display1()
	{
		System.out.println(hName);
         System.out.println(hCeo);
        System.out.println(hAddress);

	}
	public void display()
	{
		System.out.println(pName);
         System.out.println(pId);
        System.out.println( pDesease);
		System.out.println(pTreatmentamount);

	}
	public static void main(String[] args) 
	{
                    hospital h=new hospital();
					h.pName="kkk";
					h.pId=111111;
					h. pDesease="koooo";
					h.pTreatmentamount="555555";

					display1();
					h. display();
		System.out.println("Hello World!");
	}
}
