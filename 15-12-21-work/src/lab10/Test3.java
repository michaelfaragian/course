package lab10;

import java.util.Arrays;

public class Test3 {

	public static void main(String[] args) {
		
		int [] arr = new int [10];
		int [] newarr = new int[arr.length]; 
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*11);
		}
		System.out.println(Arrays.toString(arr));
		
		System.arraycopy(newarr, 0, arr, 9, 0);
		System.out.println(Arrays.toString(newarr));
	}

}
