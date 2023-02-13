package Day12;


public class UsingRunnable implements Runnable{		//inheriting the Runnable interface
	Thread t;
	int h, l;
	String msg;
	
	public UsingRunnable(int h, int l, String msg) {
		this.h = h;
		this.l = l;
		this.msg = msg;
		t = new Thread(this, "Child Thread");
		t.start();
	}

@Override
public void run() {								//abstract method inside runnable interface
	for(int i = h; i > l; i--) {
		try {
			Thread.sleep(3000);
		}catch(InterruptedException e) {
			System.out.println("Error: "+e.getMessage());
		}
		System.out.println(msg + i);
	}
	
}

}
