package Day12;


public class MultiThreading extends Thread{
	
	int n;
	String msg;
	
	public MultiThreading(int n, String msg) {
		this.msg = msg;
		this.n = n;
	}
	
	public void run() {							//new thread
		System.out.println("Thread is Running");
		for(int i = 1; i <= n; i++) {
			try {
				Thread.sleep(3000);
			}catch(InterruptedException e) {
				System.err.println("Error: "+e.getMessage());
			}
			System.out.println(msg + i);
		}
	}
}