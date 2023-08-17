package sets;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class linkedhashset {

	public static void main(String[] args) {
	LinkedHashSet<Object> l1=new LinkedHashSet<>();
           l1.add(10);
           l1.add(20);
           l1.add(10);
           l1.add("raja");
           l1.add("rani");
           System.out.println(l1);
            
           Iterator<Object> i=l1.iterator();
           while(i.hasNext())
           {
        	   System.out.println(i.next());
           }
           LinkedHashSet<Object> l=new LinkedHashSet<>();
           l.add(90);
           l.addAll(l1);
           System.out.println(l);
           
          
	}

}
