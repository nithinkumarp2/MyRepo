package programs1;

public class B {
	 
	public static void main(String [] args)
	{
		System.out.println(A.a);
		A.m1();
		new A(0, null);
		System.out.println("-----------protected class----------------");
		
		
		System.out.println(protecte.str);
		protecte.m1();
		
		
		System.out.println("----------- non-static methods&&variables----------------");
		new protecte();
		A a=new A(0, null);
		a.m2();
		System.out.println(a.str);
		
		System.out.println("-----------default class----------------");
		defaults d=new defaults();
		      d.m1();
		     d.m1(10,"nithin");
	}
	}


