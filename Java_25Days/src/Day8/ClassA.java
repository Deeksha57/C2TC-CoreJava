package Day8;
public class ClassA {
	void c() {
		System.out.println("C in A class");
	}
	void d() {
		System.out.println("D in A class");
	}

	public static void main(String[] args) {
		ClassA a = new ClassA();
		a.c();
		a.d();
	}

}