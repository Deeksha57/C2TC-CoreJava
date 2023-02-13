package Day11;

public class MultipleCatch {
	public static int divide(int x, int y) {
		int z = 0;
		z = x/y;
		System.out.println("Result is : "+z);
		return z;
	}

	public static void main(String[] args) {
		int x, y, z;
		try {
			x = Integer.parseInt(args[0]);
			y = Integer.parseInt(args[0]);
			z = divide(x, 0);
			System.out.println("z = "+z);
		}catch(ArithmeticException | NumberFormatException | ArrayIndexOutOfBoundsException e) {
			System.err.println("Error"+e.getMessage());
		}catch(Exception e) {
			System.err.println("zError is...."+e.getMessage());
		}
		System.out.println("Out side try and catch block");
	}

}
