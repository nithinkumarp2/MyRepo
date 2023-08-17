package maps;

import java.util.Set;
import java.util.HashMap;

public class hashmap {

	public static void main(String[] args) {
		 HashMap<Integer, String> m=new HashMap<>();
		 m.put(1, "nithin");
		 m.put(2, "akhil");
		 m.put(3, "manish");
		 m.put(4,"santosh");
		 String s=m.get(4);
		 System.out.println(s);
		 m.remove(2);
		 m.replace(4, "anil");
		 System.out.println(m);
		 System.out.println(m.values());
		  Set<Integer> s1=m.keySet();
		 for (Integer i : s1) {
			System.out.println("the key is :"+i+" the value is :"+m.get(i));
		}
	}

}
