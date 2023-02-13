package Day11;


public class Exception1 {

	public static void main(String[] args) {
		int b = 10;
		System.out.println(b);
		try {
			int a = 10/0;			//Arithmetic Exception
		}
		catch(ArithmeticException e){
			System.out.println("Value cannot be divided by Zero : "+e);
		}
		int c = 9;
		System.out.println(c);

	}

}

