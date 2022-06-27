package easy;

import java.util.Scanner;

public class romanChar {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter your String:");
		String s  = in.nextLine();
		System.out.println(romanToInt(s));
		in.close();
	}
	
	public static int romanToInt(String s) {
		int sum =0;
		for (int i = 0; i < s.length(); i++) {
			String a = s.substring(i, i + 1);
			if (a.equals("I")) {
				sum += 1;
			}
			if (a.equals("V")) {
				sum += 5;
			}
			if (a.equals("X")) {
				sum += 10;
			}
			if (a.equals("L")) {
				sum += 50;
			}
			if (a.equals("C")) {
				sum += 100;
			}
			if (a.equals("D")) {
				sum += 500;
			}
			if (a.equals("M")) {
				sum += 1000;
			}
		}
		return sum;
	}

}
