package Day5;

public class Father extends GrandFather{
	void c() {
		System.out.println("Method C of Father");
	}
	void d() {
		System.out.println("Method D of Father");
	}

	public static void main(String[] args) {
		Father f = new Father();
		f.a();
		f.b();
		f.c();
		f.d();

	}

}