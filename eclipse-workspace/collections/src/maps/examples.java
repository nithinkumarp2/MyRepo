package maps;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

 
 
  class count
{
public static void c()
{
	 HashMap<Integer,String> m=new HashMap<>();
     m.put(1,"hero");
     m.put(2, "raja");
//     m.replace(1, "4");
     System.out.println(m);
     Set<Integer> s= m.keySet();
     HashMap<Integer,Integer> m1=new HashMap<>();
     System.out.println(m.size());
     Set<Integer> in=m.keySet();
     for (Integer i : in) {
    	 String st=m.get(i);
    	
    	 int count=0;
		for (int j = 0; j < st.length(); j++) {
			char ch=st.charAt(j);
			count++;
			
		}
	//	m1.put(i,count);
		m1.put(i, count);
		System.out.println(count);
		m.replace(i,count+"");
	}
     
 	System.err.println(m1);
System.out.println(m);     
//     for (Integer i : s) {
//	      count++;
//	}
//     System.out.println(count);
}


  
  public static void reverse()
  {
	  HashMap<Integer,String> r=new HashMap<>();
	  r.put(1, "mohan");
	  r.put(2, "reddy");
//	 Collection<String> s= r.values();
//	  System.out.println(s); 
//	  for (String i : s) {
//	
//		System.out.println(i);
//	}
	  HashMap<Integer,String> r1=new HashMap<>();
	  Set<Integer> s=r.keySet();
	for (Integer k : s) {
		String str=r.get(k);
		 String str1="";
		// for (int i = 0; i < str.length(); i++) 
		{
			
		
		for (int j = 0; j < str.length(); j++) {
			char ch=str.charAt(j);
			str1=ch+str1;
			r1.put(k,str1);
//			 r1.put(2, str);
//			r.replace(k,str1);
		}
		 
	}  
		System.out.println(str1);	
	}
	System.err.println(r);
	System.out.println(r1);
  }  
  
  
 
  
  
  
// public static void rv() {
//	 String ste="nithin";
//	 String c=ste.toUpperCase();
//	 System.out.println(c);
//	 String str="";
//	 for (int i = 0; i < ste.length(); i++) {
//		char ch=ste.charAt(i);
//		str=ch+str;
//		System.out.println(str);
//	}
// }
   
}

public class examples {
	public static void main(String[] args) {
		 count.c();
 		count.reverse();
		//count.rv();
}
}
