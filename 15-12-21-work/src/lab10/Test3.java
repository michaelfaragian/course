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
		int i = 0;
		for (int j = arr.length -1; j >= 0; j--) {
			newarr[j] = arr[i];
			i++;
		}
		System.out.println(Arrays.toString(newarr));
	}

}
