package lab10;

import java.util.Arrays;

public class Test2 {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 5, 1, 6, 1, 5, 4, 8 };
		System.out.println(Arrays.toString(arr));
		int[] newarr = new int[arr.length];
		System.out.println(Arrays.toString(newarr));

		int c=0;
		lbl: for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < newarr.length; j++) {
				if(newarr[j] == arr[i]) {
					continue lbl;					
				} 
			}
			newarr[c] = arr[i];
			c++;
		}
		System.out.println(Arrays.toString(newarr));
		System.out.println(c);
		int[] arr1 = new int[c];
		System.out.println(Arrays.toString(arr1));
		System.arraycopy(newarr, 0, arr1, 0, c);
		System.out.println(Arrays.toString(arr1));

	}

}
