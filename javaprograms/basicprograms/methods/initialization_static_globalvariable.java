class initialization_static_globalvariable 
{
	static String loc="dilusknagar";
	       String sname;

	public static void main(String[] args) 
	{      
		 initialization_static_globalvariable q1= new  initialization_static_globalvariable ();
		    q1.sname="nithin";

		System.out.println(q1.sname);
//		System.out.println(q1.loc);

		 initialization_static_globalvariable q2= new  initialization_static_globalvariable ();
		 q1.loc="kphb";
		 q2.sname="kumar";
		 System.out.println(q2.loc);
		 System.out.println(q1.loc);
		 System.out.println(q2.sname);
		 System.out.println(q1.sname);
	}
}
