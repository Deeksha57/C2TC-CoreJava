package Day8;


public class ClassB extends ClassA {		//ClassB is Child & ClassA is my Parent class
	void a() {
		System.out.println("A in B class");
	}
	void b() {
		System.out.println("B in B class");
	}
	void c() {								//method overriding
		System.out.println("C in B class");
	}
	void d() {								//method overriding
		System.out.println("D in B class");
	}

	public static void main(String[] args) {
		ClassB b = new ClassB();
		b.a();
		b.b();
		b.c();
		b.d();
	}

}