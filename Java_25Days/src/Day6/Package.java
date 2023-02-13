package Day6;

public class Package {
	final void a() {
		System.out.println("Method A");
	}
	void b() {
		System.out.println("Method b");
	}
	void c() {
		System.out.println("Method c");
	}
	public static void main(String[] args) {
		Package a = new Package();
		a.a();

	}

}
