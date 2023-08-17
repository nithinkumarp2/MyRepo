package string_methods;

public class a4d2c2b2d2 {
	
	
	public static void m1()
	{
		 String str="aaaaddccbbdd";
		 int n=str.length();
		 String str1="";
//		 for (int i = 0; i < n; i++) {
//			char c=str.charAt(i);
//			boolean res=false;
//			int n1=str1.length();
//			for (int j = 0; j < n1; j++) {
//				
//				char ch=str1.charAt(j);
//				if (c==ch) {
//					res=true;
//				}
//			}
//			 if (res==false) {
//				str1=str1+c;	
//				}
//		}
		//System.out.println(str1);
		int count=0;
		char c=str.charAt(0);
		String s="";
		for (int i = 0; i <str.length(); i++) {
			int count1=0;
			char c1=str.charAt(i);
			for (int j = i; j <n; j++) {
				char c2=str.charAt(j);
				if (c1==c2)
				{
				count1++;
				//c=c2;
				}
				else
				{
					i=j-1;
				break;
				}
				
			}
			if(count1>1)
			{
				s=s+c1+count1;
				//count=count1;
				
			}
 //  System.out.print(c1 );System.out.println(+count);
		}
		System.out.println(s);
		
	}

	
	  public static void m2()
	  {
		  String str="aaaaddccbbdd";
		  String s="";
		  int count1=0;
		//  String[]s1=str.split("");
		//  char[] c=str.toCharArray();
		  for (int i = 0; i < str.length(); i++) {
		    //  System.out.println(s1[i]);
			  
			  char ch=str.charAt(i);
			  int count=0;
			  for (int j = i; j < str.length(); j++) {
				char ch1=str.charAt(j);
				
                          if(ch==ch1) {
                        	count++;  
                        	
                          }
                          else
                          {
                      
                        	  i=j-1;
                        	  System.out.println(i);
                        	  break;
                          }
                          count1=count;
			}
			   if(count1>1)
 				{
 				 
 					s=s+ch+count1;
 					
 				}
		}
		  
		  System.err.println(s);	
		//  System.out.println();
	  }
	
	
	
	public static void main(String[] args) {
		
		m1();
		//	m2();
	}
	

}
