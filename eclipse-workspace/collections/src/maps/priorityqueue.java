package maps;

 
import java.util.PriorityQueue;
import java.util.Queue;

public class priorityqueue {

	public static void main(String[] args) {
		 PriorityQueue<Integer> pq= new PriorityQueue<>();
		 pq.add(100);
		 pq.add(10);
		 pq.add(50);
		 System.out.println(pq);
		 
		 Queue<Integer> p=new PriorityQueue<>();
		 int[]a= {30,40,80,20,10,60,30,30,25,12,65};
		 for (Integer i : a) {
			 p.add(i);
			// System.out.println(i);
		}
		 
System.err.println(p);
	}

}
