package lab8;

public class Test6 {

	public static void main(String[] args) {

		int c = 0;
		int max = 0;
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*101);
			System.out.print(arr[i] + ", ");
			c++;
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println();
		System.out.println("index: " + c);		
		System.out.println("max number: " + max);
	}

}
