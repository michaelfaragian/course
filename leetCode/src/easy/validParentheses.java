package easy;

import java.util.Scanner;

public class validParentheses {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String input = in.next();
		in.close();
		System.out.println(isValid(input));

	}
	
	public static boolean isValid(String s) {
		return false;
	}

}
