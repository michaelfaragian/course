package easy;

import java.util.Scanner;

public class palindrom {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter your number:");
		int num = in.nextInt();
		in.close();
		System.out.println(check(num)); 
	}
	public static boolean check(int num) {
		int y = 0;
		int z = num;
		while (num !=0) {
			y *= 10;
			y += num % 10;
			num = (int)(num / 10);
		}
		if (y == z ) {
			return true;
		}
		return false;
	}

}
