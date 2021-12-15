package lab45;

public class Boom {

	public static void main(String[] args) {

		int a = (int)(Math.random()*101);
		System.out.println(a);
		
		for (int i = 1; i <= a; i++) {
			if (i % 7 == 0) {
				System.out.println("boom");
			}else if (i % 10 == 7) {
				System.out.println("boom");
				
			}else if (i / 10 == 7) {
				System.out.println("boom");
			} else
				System.out.println(i);
		}
		
	}

}
