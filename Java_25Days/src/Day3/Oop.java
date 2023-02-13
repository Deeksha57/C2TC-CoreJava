package Day3;

public class Oop {
	int a = 5;
	int b = 10;
	double c = 11.1;
	void MethodA() {				//method is a block of code
		System.out.println("Method A");
	}
	void MethodB() {
		System.out.println("Method B");
	}
	void MethodC() {
		System.out.println("Method C");
	}
	void MethodD() {
		System.out.println("Method D");
	}
	public static void main(String[] args) {
		Oop obj = new Oop();		//Object creation 
		Oop obj2 = new Oop();
		Oop obj3 = new Oop();
		obj.MethodD();
		obj.MethodB();
		obj.MethodA();
		obj.MethodC();
		obj2.MethodA();
		obj2.MethodC();
		obj3.MethodC();
		obj2.MethodD();
		System.out.println(obj.a);
		System.out.println(obj2.a);
		System.out.println(obj2.b);
		System.out.println(obj2.c);

	}

}