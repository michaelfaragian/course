package lab1;

public class BiggerValue {

	public static void main(String[] args) {

		int a = (int)(Math.random()*101);
		int b = (int)(Math.random()*101);
		
		System.out.println(a);
		System.out.println(b);
		if ( a > b) {
			System.out.println("the bigger is " + a);
			
		}else
			System.out.println("the bigger is " + b);
         
		
	}

}
