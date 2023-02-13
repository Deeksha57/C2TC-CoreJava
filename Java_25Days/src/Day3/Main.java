package Day3;

public class Main {
	
	int a = 10;
	float b = 2.44f;
	char c = 'a';
	String s = "hello";
	double d = 3.22;
	
	
	void Method_1() {
		System.out.println("method 1");
	}
	
	static void Method_2() {
		System.out.println("method 2");
	}
	
	
	public static void main(String args[]) {
		Main obj1 = new Main();
		obj1.Method_1();
		
		Method_2();
		System.out.println(obj1.a +" "+ obj1.b +" "+ obj1.c +" "+ obj1.d);
		
	}
}
