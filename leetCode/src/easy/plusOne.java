package easy;

import java.util.Arrays;
import java.util.Scanner;

public class plusOne {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] nums = new int[3];
		System.out.println("Enter the numbers:");
		for (int i = 0; i < nums.length; i++) {
			nums[i] = in.nextInt();
		}
		in.close();
		System.out.println(Arrays.toString(plus(nums)));
	}

	private static int[] plus(int[] nums) {
		int size = nums.length - 1;
		int sum = nums[size];
		nums[size] = sum + 1;
		return nums;
	}

}
