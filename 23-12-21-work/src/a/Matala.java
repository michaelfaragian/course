package a;

import java.util.Arrays;

public class Matala {

	public static void main(String[] args) {

		int[] nums1 = new int[15];
		int[] nums2 = new int[15];

		for (int i = 0; i < nums1.length; i++) {
			nums1[i] = (int) (Math.random() * 10);
		}
		for (int i = 0; i < nums2.length; i++) {
			nums2[i] = (int) (Math.random() * 10);
		}

		System.out.println("nums1: " + Arrays.toString(nums1));
		System.out.println("nums2: " + Arrays.toString(nums2));

		System.out.print("the biggest number from nums1 : ");
		lbl: for (int i = 9; i > 0; i--) {
			for (int j = 0; j < nums1.length - 2; j++) {
				if (i == nums1[j]) {

					System.out.print(i);
					System.out.print(nums1[j + 1]);
					System.out.println(nums1[j + 2]);
					break lbl;
				}
			}
		}
		int[] distinct = new int[10];
		for (int i = 0; i < distinct.length; i++) {
			distinct[i] = -1;
		}

		 for ( int n =0; n < 10; n++) {
			 for (int j = 0; j < nums1.length; j++) {
				for (int j2 = 0; j2 < nums2.length; j2++) {
					 	for (int i = 0; i < distinct.length; i++) {
						if (n == nums1[j] && n!=nums2[j2] && n!= distinct[i]) {
							distinct[i] = n;
						
					 }

				
					}

				}

			}

		}
		System.out.println(Arrays.toString(distinct));
	}

}
