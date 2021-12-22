package a;

import java.util.Arrays;

public class Targil {

	public static void main(String[] args) {

		int [] nums1 = new int [25];
		//int [] nums2 = new int [25];
		
		for (int i = 0; i < nums1.length; i++) {
			nums1 [i] = (int)(Math.random()*10);
		}
//		for (int j = 0; j < nums2.length; j++) {
//			nums2 [j] = (int)(Math.random()*10);
//		}
		
		System.out.println(Arrays.toString(nums1));
		//System.out.println(Arrays.toString(nums2));
		int x =0;
		int max = 0;
		int n = 0;
		for (int i = 0; i < 10; i++) {
			
			for (int j = 0; j < nums1.length; j++) {
					if(i == nums1[j]) {
						x++;
						
					}
					if(x >= max) {
						max=x;
						n = i ;
					}
			}
			System.out.println(i + " - " + x);
			x = 0;
			
		}
		System.out.println("the number: " + n + " perform " + max + " times ");
		System.out.println("the big number: " + n  *(max) );
		for (int i = 0; i < max; i++) {
			System.out.print(n);
		}
	}

}
