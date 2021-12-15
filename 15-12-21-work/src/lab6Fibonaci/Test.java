package lab6Fibonaci;

public class Test {

	public static void main(String[] args) {

		int f1 = 1;
		int f2 = 1;
		int f3;
		
		System.out.println(f1);
		System.out.println(f2);
		
		for (int i = 3; i < 41; i++) {
			f3 = f1 + f2;
			f1 = f2;
			f2 = f3;
			
			System.out.println(f2);
		}
		
	}

}
