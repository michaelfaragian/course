package b;

import java.util.Scanner;

public class Targil2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while(true) {
		try {
			System.out.println("enter first number: ");
			int a = Integer.parseInt(sc.nextLine());
			System.out.println("enter second number: ");
			int b = Integer.parseInt(sc.nextLine());
			System.out.println(a + " + " + b + " = " +(a+b));
			break;
		}catch (Exception e) {
			System.out.println("you entered wrong input");
		}
		}
		sc.close();
		
		System.out.println("==end of program==");
	}

}
