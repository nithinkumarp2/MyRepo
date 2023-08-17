package string_methods;

public class a3b2c2 {

	public static void main(String[] args) {
		 
		
		String str= "a3b2c2d4";
		int n=str.length();
		String s="";
		String s1="";
      for (int i = 0; i <n; i++) {
		char ch=str.charAt(i);
		if (ch>=48&&ch<=57) {
			
			int i1=Integer.parseInt(ch+"");
		//	System.out.println(i1);
			for (int j = 0; j <i1; j++) {
				s1=s1+str.charAt(i-1);
			}
		}
		else
		{
			s=s+ch;
		}
		
	}
      //System.out.println(s);
      System.err.println(s1);
	}

}
