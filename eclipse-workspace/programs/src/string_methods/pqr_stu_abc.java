package string_methods;

public class pqr_stu_abc {

	public static void main(String[] args) {

         String[] str= {"pqr","stu","abc"};
        
         String[]s1=new String[str.length];
         for (int i = 0; i <str.length; i++) {
        	 String st=str[i];
        	 String s="";
        	 for (int j = 0; j <st.length(); j++) {
//        		 
//                       char c=st .charAt(i);
                      // if(i==j)
                      s+=str[j].charAt(i);
                       
        	 }
        	 s1[i]=s;  
        	// System.out.println(str[i]);
        	    System.out.println(s1[i]);
        	   
         }
     for (int i = 0; i < str.length; i++) {
		//System.out.println(s1[i]);
	}
}
}
