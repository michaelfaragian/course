package lab9;

public class Test2 {

	public static void main(String[] args) {
		
		int [] arr = new int [10];
		for (int i = 0; i < arr.length; i++) {
			arr [i] = (int)(Math.random()*101);
			System.out.print(arr[i] + ", ");
			
			
		}
		System.out.println();
		System.out.print("odd: ");
		
		for (int j = 0; j < arr.length; j++) {
			if (arr[j] % 2 != 0 ) {
				System.out.print(arr[j] + ", ");
			
		}
		
		}
		
		
		
	}

}
