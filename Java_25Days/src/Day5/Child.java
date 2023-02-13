package Day5;

public class Child extends Father {
	void e() {
		System.out.println("Method E of Child");
	}
	void f() {
		System.out.println("Method F of Child");
	}

	public static void main(String[] args) {
		Child c = new Child();
		c.a();
		c.b();
		c.c();
		c.d();
		c.e();
		c.f();

	}

}