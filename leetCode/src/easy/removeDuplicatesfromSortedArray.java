package easy;

import java.util.HashSet;
import java.util.Scanner;

public class removeDuplicatesfromSortedArray {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the array: ");
		int [] nums = new int [10];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = in.nextInt();
		}
		in.close();
		System.out.println(remove(nums));
		
	}

	private static int remove(int[] nums) {
		HashSet<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < nums.length; i++) {
			set.add(nums[i]);
		}
		System.out.println(set);
		return nums.length - set.size();

	}

}
