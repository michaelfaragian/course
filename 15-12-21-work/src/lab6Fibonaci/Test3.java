package lab6Fibonaci;

public class Test3 {

	public static void main(String[] args) {
		
		int index = (int)(Math.random()*41) + 10;
		System.out.println(index);

		int f1 = 1;
		int f2 = 1;
		int f3;
		
		System.out.println(f1);
		System.out.println(f2);
		
		for (int i = 3; i <= index; i++) {
			f3 = f1 + f2;
			f1 = f2;
			f2 = f3;
			
			System.out.println(f2);
		}
		
	}

}
