package easy;

import java.util.Scanner;

public class sqrt {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num = in.nextInt();
		in.close();
		System.out.println(mySqrt(num));
	}
	private static int mySqrt (int num) {
		return (int) Math.sqrt(num);
	}

}
