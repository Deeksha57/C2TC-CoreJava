package Day3;

public class Static {
	static int a = 5;
	static double b = 10.5;
	static void Method() {
		int a = 23;
		System.out.println("Method value is : "+a);
	}

	public static void main(String[] args) {
		Method();
		System.out.println("Integer is : "+a);
		System.out.println("Decimal is : "+b);
		a = 22;
		System.out.println("Modified Integer is : "+a);
	}

}