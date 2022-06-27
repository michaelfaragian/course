package easy;

import java.util.Scanner;

public class lengthofLastWord {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String input = in.next();
		in.close();
		System.out.println(word(input));
	}
	private static int word(String input) {
		String [] arr = input.trim().split(" ");
		return arr[arr.length-1].length();
		
	}

}
