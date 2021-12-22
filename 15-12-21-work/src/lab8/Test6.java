package lab8;

public class Test6 {

	public static void main(String[] args) {

		int c = 0;
		
		int[] arr = new int[10];
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*101);
			System.out.print(arr[i] + ", ");
			if(arr[i] > max) {
				max = arr[i];
				c = i ;
			}
		}
		System.out.println();
		System.out.println("index: " + c);		
		System.out.println("max number: " + max);
	}

}
