package list;

import java.util.LinkedList;

public class linkedlist_performing_operations {
	public static void main(String[] args) {

        Integer[] a= {1,2,3};
		LinkedList<Object> l1= new LinkedList<>();
		l1.add(100);
		l1.add('p');
		l1.add("nithin");
		l1.add(100.2);
		l1.add(false);
		System.err.println(l1);
		System.out.println(l1.get(0));
		System.out.println(l1.size());
		l1.add(0, 500);
		l1.remove(1);
		//l1.remove(100);
//		for (int i = a.length-1; i >=0 ; i--) {
//		//	l1.set(4, a[i]);
//			l1.add(0, a[i]);
//			System.err.println(i);
//		}
		
		System.out.println(l1);
		
		 System.out.println(l1.contains(100.2));
		 System.out.println(l1.isEmpty());

	}
}
