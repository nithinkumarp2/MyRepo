package sets;

import java.util.*;

 

public class hashset {

	public static void main(String[] args) {
		 HashSet<Integer> h=new HashSet<>();
		 h.add(10);
		 h.add(20);
		 System.out.println(h);
	//	 h.remove(10);
		// System.out.println(h);
		 Set<Integer> h1=new HashSet<>();
		 h1.addAll(h);
		 h1.add(30);
		 h1.add(50);
		 h1.add(50);//duplicate elements is not possible in hashset
		 System.err.println(h1);
//		 h1.retainAll(h);
//		 System.out.println(h1);
		 System.out.println(h1.size());
		 System.out.println(h1.isEmpty());
		 
		 for (Integer i : h1) {
			System.out.println(i);
		}
		 
	}

}
