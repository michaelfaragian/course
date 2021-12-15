package lab2;

public class Test3 {

	public static void main(String[] args) {

		int a = (int)(Math.random()*101);
		int b = (int)(Math.random()*101);
		int c = (int)(Math.random()*101);
		
		
		
		if ( a > b && a > c) {
			System.out.println(a);
		}else if (b > a && b > c) {
			System.out.println(b);
		}else 
			System.out.println(c);
			
		
		
		
		
		
		}

}
