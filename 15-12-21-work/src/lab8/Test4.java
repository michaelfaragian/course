package lab8;

public class Test4 {

	public static void main(String[] args) {

		int avg = 0;
		int sum = 0;
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*101);
			System.out.print(arr[i] + ", ");
			sum += arr[i];
			
		}
		avg = sum / arr.length;
		System.out.println();
		System.out.println("sum of numbers: " + sum);
		System.out.println("avg of numbers: " + avg);
		
	}

}
