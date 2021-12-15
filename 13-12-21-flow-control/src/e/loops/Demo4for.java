package e.loops;

public class Demo4for {

	public static void main(String[] args) {

		
		// print all numbers from 101 - 110 inclusive
		for (int i = 101; i <= 110; i++) {
			System.out.println(i);
		}
		System.out.println("===========");
		
		// print all numbers from 100 - 50 inclusive
		for(int i = 100; i >= 50; i--) {
			System.out.println(i);
		}
		System.out.println("==============");
		
		// print all even numbers from 100 - 200
		for(int i = 100; i <= 200; i+=2) {
			System.out.println(i);
		}
		System.out.println("=============");
		
		//print all numbers from 0 - 100 that divide by 7
		for ( int i = 0; i <= 100; i++) {
			if (i % 7 ==0) {
				System.out.println(i);
			}
		}
		System.out.println("===========");
		
		//print all characters from a - z
		for (char i = 'a'; i <= 'z'; i++) {
			System.out.println(i + " - " + (int)i);
		}
		int a = 10;
	    for (int i = 0; i <= 10; i++) {
	    	System.out.println(i+ " - " + a);
	    	a--;
	    }
			
	
		
		
		
		
		
	}


}
