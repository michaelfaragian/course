package easy;

import java.util.Scanner;

public class searchInsertPosition {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int [] nums = new int[5];
		System.out.println("Enter the array: ");
		for (int i = 0; i < nums.length; i++) {
			nums[i] = in.nextInt();
		}
		System.out.println("Enter the target:");
		int target = in.nextInt();
		in.close();
		System.out.println(search(nums, target));
	}
	
	private static int search (int [] nums , int target) {
		for (int i = 0; i < nums.length; i++) {
			if(nums[i] == target) {
				return i;
			}
		}
		for (int i = 0; i < nums.length; i++) {
			if(nums[i] > target) {
				return i--;
			}
			if(nums[nums.length - 1] < target) {
				return nums.length ;
			}
		}
		return 0;
	}

}
