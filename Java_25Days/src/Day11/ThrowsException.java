package Day11;
import java.util.Scanner;

public class ThrowsException {
	static int acceptNumber() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		return n;
	}
	public static void main(String args[]) {
		int per;
		System.out.println("Enter the number");
		per = acceptNumber();
		try {
			if(per<0) {
		
				throw new ArithmeticException("Percentage should not be negative");
			}
			else if (per>100) {
				throw new ArithmeticException("Percentage should not be greater than 100");
			}
			else {
				System.out.println("Valid percentage : "+per);
			}
		}catch(Exception e) {
			System.err.println(e.getMessage());
		}
	}

}