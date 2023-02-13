package Day12;


class Chrome extends Thread{
	public void run() {
		for(int i = 0;i<5;i++)
			System.out.println("Chrome thread ID is : "+Thread.currentThread().getId());
	}
}
class Ppt extends Thread{
	public void run() {
		for(int i = 0;i<5;i++)
			System.out.println("PPT thread ID is : "+Thread.currentThread().getId());
	}
}
class Eclipse extends Thread{
	public void run() {
		for(int i = 0;i<5;i++)
			System.out.println("Eclipse thread ID is : "+Thread.currentThread().getId());
	}
}
public class MultiThreadingPriority {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Chrome c = new Chrome();
		Ppt p = new Ppt();
		Eclipse e = new Eclipse();
		c.start();
		c.setPriority(Thread.MAX_PRIORITY);
		p.start();
		e.start();
		c.stop();

	}

}