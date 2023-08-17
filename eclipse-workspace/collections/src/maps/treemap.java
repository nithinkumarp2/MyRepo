package maps;

import java.util.Set;
import java.util.TreeMap;

public class treemap {

	public static void main(String[] args) {
		TreeMap<String , String> lm=new TreeMap<>();
		lm.put("a", "nithin");
		 lm.put("b", "kumar");
		 lm.put("c", "slk");
		 lm.replace("c", "SLK PHOTO POINNT");
		 System.out.println(lm);
		 Set<String> s=lm.keySet();
		 for (String i : s) {
			System.out.println(i+" "+lm.get(i));
		}

	}

}
