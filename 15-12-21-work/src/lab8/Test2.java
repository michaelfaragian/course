package lab8;

public class Test2 {

	public static void main(String[] args) {

		int avg = 0;
		int sum = 0;
		for (int i = 0; i < 10; i++) {
			int arr = (int)(Math.random()*101);
			
			System.out.print(arr + ",");
			sum = sum + arr;
			avg = sum /10;
		}
		System.out.println();
		System.out.println("the sum of the number: " + sum);
		System.out.println("the avg: " + avg);
		
		/**int [] n = new int [10];
		for (int i = 0; i < n.length; i++) {
			n[i] = (int)(Math.random()*101);
			System.out.println(i);
		}
		*/
	}

}
