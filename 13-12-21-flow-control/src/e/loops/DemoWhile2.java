package e.loops;

import java.util.Scanner;

public class DemoWhile2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int password = 123;
		System.out.print("enter password: ");
		int c = 1;		
		int input = sc.nextInt(); // input operation
		
		while(input != password && c < 3) {
			System.out.print("enter password again: ");
			 input = sc.nextInt();			
			c++;
		}
		
		sc.close();
		if (input == password) {
			System.out.println(" you are logged in");
		}else {
			System.out.println("login failed");
		}
	}

}
