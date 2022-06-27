package drill;

import java.util.Arrays;

public class a {
	
	public static void main(String[] args) {
	
	int sum = 0;
	int big = 0;
	int small = 0;
	int biggest = 0;
	int [] nums = new int[10];
	
	for (int i = 0; i < nums.length; i++) {
		nums[i] = (int)(Math.random()*101);
		sum += nums[i];
		if(nums[i] > biggest) {
			biggest = nums[i];
		}
		if(nums[i] > 80) {
			big ++;
		}
		if(nums[i] < 20) {
			small ++;
		}
	}
	System.out.println(Arrays.toString(nums));
	System.out.println("The sum: " + sum);
	
	for (int i = 0; i < nums.length; i++) {		
		System.out.println("Ten: " + nums[i] / 10); 
	}
	System.out.println("Big then 80: "+ big);
	System.out.println("Small then 20: "+ small);
	System.out.println("The biggest number: " + biggest);
	
	int three = 0;
	
	for (int i = 0; i < nums.length; i++) {
		if (nums[i] % 2 == 0) {
			System.out.println("zugi: "+ nums[i]);
		}
			if(nums[i] % 3 == 0) {
				three ++;
			}
	}
	System.out.println("The three: " + three);
		
	}
}
