package lab8;

public class Test8 {

	public static void main(String[] args) {

		int c = 0;
		int a = 0;
		int sum = 0;
		int avg = 0;
		
		int[] arr = new int[10];
		arr[0] = (int)(Math.random()*101);
		System.out.print(arr[0] + ", ");
		int min=arr[0];
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*101);
			System.out.print(arr[i] + ", ");
			sum += arr[i];
			avg = sum / arr.length;
			
			if(arr[i] < min) {	
				min = arr[i];
				c = i;
			}
			if ( arr[i] > max)
				max = arr[i];
				a = i;
		}
		
	
		
		System.out.println();
		System.out.println("sum: "  + sum);
		System.out.println("avg: " + avg);
		System.out.println("min: " + min + " index: " + c);
		System.out.println("max: " + max + " index: " + a);
		
	}

}
