package easy;

import java.util.Scanner;

public class longestCommonPrefix {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] str = new String[3];
		System.out.println("Enter your words:");
		for (int i = 0; i < str.length; i++) {
			str[i] = in.next();
		}
		in.close();
		System.out.println(checkPrefix(str));
	}

	public static String checkPrefix(String[] str) {
		if (str.length == 0) {
			return "  ";
		}
		String prefix = str[0];
		for (int i = 0; i < str.length; i++) {
			while (str[i].indexOf(prefix) != 0) {
				prefix = prefix.substring(0, prefix.length() - 1);
			}
		}
		return prefix;
	}
}
