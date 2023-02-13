package Day12;
public class ThreadDemo {

	public static void main(String[] args) {
		MultiThreading t1 = new MultiThreading(5, "First");
		MultiThreading t2 = new MultiThreading(10, "Second");
		
		t1.start();
		t2.start();

	}

}