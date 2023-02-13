package Day9;

public class autoBoxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// autoboxing....
		int a = 10;
		// wrapper class..
		Integer d = a;
		Integer b = Integer.valueOf(a);
		
		char c = 'c';
		Character c1 = c;
		System.out.println(c1);
		System.out.println(c);
		System.out.println(d);
		System.out.println(b);
	}

}
