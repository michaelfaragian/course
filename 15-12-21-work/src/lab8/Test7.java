package lab8;

public class Test7 {

	public static void main(String[] args) {

		int c = 0;
		int[] arr = new int[10];
		arr[0] = (int)(Math.random()*101);
		System.out.print(arr[0] + ", ");
		int min=arr[0];
		for (int i = 1; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*101);
			System.out.print(arr[i] + ", ");
			if(arr[i] < min) {	
				min = arr[i];
				c = i;
			}
		}
		System.out.println();
		System.out.println("min: " + min + " index: " + c);
	}

}
