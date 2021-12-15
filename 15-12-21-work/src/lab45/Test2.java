package lab45;

public class Test2 {

	public static void main(String[] args) {
        int temp = 0;
		int a = (int)(Math.random()*101);
		int b = (int)(Math.random()*101);
		
		if ( a > b) {
			temp = a;
			a = b;
			b = temp;
		}
					
		for (int i = 1; i < b; i++) {
			System.out.println(i);
		}
	}

}
