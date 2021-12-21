package lab8;

public class Test7 {

	public static void main(String[] args) {

		int c = 0;
		int min = 101;
		
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*101);
			System.out.print(arr[i] + ", ");
			if(arr[i] < min) {	
				min = arr[i];
				c = i +1;
			}
		}
		System.out.println();
		System.out.println("index: " + c);		
		System.out.println("min number: " + min);
	}

}
