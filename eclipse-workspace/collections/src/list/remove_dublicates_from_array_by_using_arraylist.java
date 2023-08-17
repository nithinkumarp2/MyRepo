package list;

 
import java.util.ArrayList;

public class remove_dublicates_from_array_by_using_arraylist {

	public static void main(String[] args) {
		 
		int []a= {1,2,4,5,6,77,7,8,2,5,4,3,6,7,7,7,43,33,3,3,8};
		ArrayList<Integer> b= new ArrayList<>();
		for (int i = 0; i < a.length; i++) {
			 if (b.contains(a[i])==false) {
				b.add(a[i]);
			}
		}
		System.err.println(b);
		
		Object[] c=b.toArray();
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
		}
	}

}