package Day11;

import java.util.Scanner;

public class Finally1 {

	public static void main(String[] args) {
		int b = 10;
		System.out.println(b);
		Scanner sc = new Scanner(System.in);
		int d = sc.nextInt();
		try {
			int a = 10/d;			//Arithmetic Exception
			System.out.println(a);
		}
		catch(ArithmeticException e){
			System.out.println("Value cannot be divided by Zero : "+e);
		}
		finally {
			System.out.println("Whatever happes i will get Executed");
		}
		int c = 9;
		System.out.println(c);

	}

}