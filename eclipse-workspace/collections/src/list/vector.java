package list;

import java.util.Vector;

public class vector {
	public static void main(String[] args) {


		Vector<Object> v=new Vector<>();
		v.add(100);
		v.add('p');
		v.add("nithin");
		v.add(100.2);
		v.add(false);
		System.err.println(v);
		System.out.println(v.get(0));
		System.out.println(v.size());
		v.add(0, 500);
		v.remove(1);
		//v.remove(100);
//		for (int i = a.length-1; i >=0 ; i--) {
//		//	v.set(4, a[i]);
//			v.add(0, a[i]);
//			System.err.println(i);
//		}
		
		System.out.println(v);
		
		 System.out.println(v.contains(100.2));
		 System.out.println(v     .isEmpty());

	}
}
