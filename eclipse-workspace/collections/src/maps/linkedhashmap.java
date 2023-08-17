package maps;

import java.util.LinkedHashMap;
import java.util.Set;

public class linkedhashmap {

	public static void main(String[] args) {
	 LinkedHashMap<String, String> lm=new LinkedHashMap<>();
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
