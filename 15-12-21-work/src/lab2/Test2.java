package lab2;

public class Test2 {

	public static void main(String[] args) {

		int a = (int)(Math.random()*101);
		System.out.println(a);
		
		if(a > 50) {
			System.out.println("big");
		}else if (a < 50) {
			System.out.println("small");
		}else 
			System.out.println("bingo!");
		
		if ( a % 2 == 0) {
			System.out.println("even");
		}else 
			System.out.println("odd");
	}

}
