package multithreading;

class ownthread1 extends thread{

	public void run() {
		Thread.currentThread().setName("own name");
		System.out.println(Thread.currentThread().getName());
	}
	
}

class ownthread2 extends thread{

	public void run() {
		Thread.currentThread().setName("second thread");
		System.out.println(Thread.currentThread().getName());
	}
	
}

public class getandsetmethods {

	public static void main(String[] args) {
		ownthread1 ownthread= new ownthread1();
		ownthread2 ownthread2= new ownthread2();
		ownthread.setPriority(10);
		ownthread.start();
		ownthread2.start();
	//	Thread.currentThread().setName("own namelllllllllllllllllll");
		//System.out.println(Thread.currentThread().getName());
		
	
	}

}
