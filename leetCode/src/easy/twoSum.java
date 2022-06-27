package easy;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class twoSum {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("enter your array:");
		int nums [] = new int [7];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = in.nextInt();
		}
		System.out.println(Arrays.toString(nums));
		System.out.println("enter your target:");
		int target = in.nextInt();
		equalIndex(nums, target);
		
		in.close();
	}
	public static void equalIndex(int [] nums , int target) {
		for (int i = 0; i < nums.length; i++) {
			if(nums[i] + nums[i + 1] == target) {
				System.out.println("index: " + i + " and " + (i + 1));
				break;
			}
		}		
		
	}

}
