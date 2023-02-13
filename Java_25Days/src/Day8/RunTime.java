package Day8;

public class RunTime {
	void a() {
		System.out.println("Method A of Parent");
	}
	void b() {
		System.out.println("Method B of Parent");
	}
	public static void main(String[] args) {
		RunTime r = new RunTime();
		r.a();
		r.b();

	}

}

