package lab9;

public class Test3 {

	public static void main(String[] args) {
		
		
		int sum = 0;
		int [] arr = new int [10];
		System.out.print("numbers: ");
		for (int i = 0; i < arr.length; i++) {
			arr [i] = (int)(Math.random()*101);
			System.out.print(arr[i] + ", ");
		}
		System.out.println();
		System.out.print("even: ");
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 ==0) {
				System.out.print(arr[i] + ", ");
				sum += arr[i];
			}
		}
		System.out.println();
		System.out.println("sum: " + sum );
		
	}

}
