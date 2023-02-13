package Day5;

public class GrandFather {
	void a() {
		System.out.println("Method A of GrandFather");
	}
	void b() {
		System.out.println("Method B of GrandFather");
	}

	public static void main(String[] args) {
		GrandFather gf = new GrandFather();
		gf.a();
		gf.b();

	}

}