package list;

 

import java.util.ArrayList;

public class arraylist {

	public static void main(String[] args) {
		ArrayList<Object> a1= new ArrayList<>();
		
		a1.add(100);
		a1.add("nithin");
		a1.add('p');
		a1.add(100.5);
		a1.add(true);
		a1.add(200);
		a1.add(300);
		System.out.println(a1);
		System.out.println(" get method will gets the element in the array list");
		System.err.println(a1.get(0));
		System.out.println("size method will print the size of the array list");
		int n=a1.size();
		System.err.println(n);
		System.out.println("add(index value,object) it will adds at that index postion"+
		"instead of that value this value will b added and at that position value moves"+
		"to the next position");
		
		a1.add(0,"kumar");
		System.err.println(a1);
		
		System.out.println( "remove method will removes the element from that position ");
		
		a1.remove(7);
		System.err.println(a1);
		
		
		System.out.println(" set method will removes given index value and adds the"
				+ " new element to that position");
		
		a1.set(5,"nithin" );
          System.err.println(a1);
          
          System.out.println("conntains method will checks whether the given number is present"
          		+ " or not in that list");
          
          System.err.println(a1.contains("nithin"));
          
          System.out.println("indexOf will be finds the value of the element");
          
          System.err.println(a1.indexOf('p'));
          
          System.out.println("isEmpty method will list is empty or not");
          System.err.println(a1.isEmpty());
          
          System.out.println("toArray method will converts the arraylist objects into array");
          
          Object[] b=a1.toArray();
          for (int i = 0; i < b.length; i++) {
        	  System.err.println(b[i]);
		}
      //    String str="";
          for (Object i:  a1) {
			System.out.println(i);
			 
		}
         // System.err.println(str);
          
	}

}
