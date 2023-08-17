package multithreading;


class  thread extends Thread{

	public void run() {
			System.out.println("hello");
	}
}
public class ownthread{
	public static void main(String[] args) {
		
		thread thread=new thread();
		thread.start();
		
		for (int i = 0; i <=5; i++) {
			System.out.println(i);
		}
	}
}
