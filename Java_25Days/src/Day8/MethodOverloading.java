package Day8;

public class MethodOverloading { // same name but different params
	void a() {
		System.out.println("method one with no params");
	}
	
	void a(int a) {
		System.out.println("method two with params "+a);
	}
	

	public static void main(String[] args) {
		MethodOverloading mo = new MethodOverloading();
		mo.a();
		mo.a(24);
	}

}