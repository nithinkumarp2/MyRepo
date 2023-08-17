package string_methods;

public class palandrome {

	public static void main(String[] args) {
		String str="madam arora teacher malayalam";
		 String[] s=str.split(" ");
		
		 for (int i = 0; i < s.length; i++) {
			 String s1=s[i];
			 String rev="";
			 String pal="";
//			System.out.println(s1);
			 for (int j = 0; j < s1.length(); j++) {
				rev=s1.charAt(j)+rev;
				
			}
			 if(rev.equals(s[i]))
			 {
				 pal=pal+rev;
				 System.out.println(pal);
			 }
			// System.out.println(rev);
		}
		 	
		
		  	
	}

}
