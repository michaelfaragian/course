package easy;

import java.util.Arrays;
import java.util.Scanner;

public class removeElemet {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int [] nums = new int[5];
		System.out.println("Enter the array: ");
		for (int i = 0; i < nums.length; i++) {
			nums[i] = in.nextInt();
		}
		System.out.println("Enter the val:");
		int val = in.nextInt();
		in.close();
		System.out.println(remove(nums, val));
	}
	
	
	private static int remove(int[] nums , int val) {
		int [] newnums = new int [nums.length];
		int k = nums.length;
		for (int i = 0; i < nums.length; i++) {
			if(nums[i] != val) {
				newnums[i] = nums[i];
			}else {
				k--;
			}
		}
		System.out.println(Arrays.toString(newnums)); 
		return k;
	}

}
