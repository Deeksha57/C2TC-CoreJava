package Day11;

public class NestedTry {

	public static void main(String[] args) {
		int a[] = {1,2,3,4,5};
		try {
			int b = 10 / 2;
			System.out.println(b);
			try {
				System.out.println(a[6]);
			}catch (Exception e){
				System.out.println(e);
			}
		}catch(Exception e){
			System.out.println(e);
		}
		System.out.println("Out of Try block");
	}

}