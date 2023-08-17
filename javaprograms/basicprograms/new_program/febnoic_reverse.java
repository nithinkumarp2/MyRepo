class febnoic_reverse 
{
	public static void main(String[] args) 
	{
		int a=0,b=1,m=5; int c=b,rev=0;
		System.out.println(a);
		System.out.println(b);
		while (m<=b-2)
		{
			 c=a+b;
			a=b;
			b=c;
			//System.out.println(c);
			
			int last=c%10;
             rev=rev*10+last;
		 c/=10;
		}
//		int rev=0;
//		while (c>0)
//		{
//		int last=c%10;
  //           rev=rev*10+last;
	//		 c/=10;
	//	
	  	System.out.println(c);
	//	}
	}
}
