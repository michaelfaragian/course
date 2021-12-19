package lab8;

public class Test3 {

	public static void main(String[] args) {

		int max = 0;
		for (int i = 0; i < 10; i++) {
			int arr = (int)(Math.random()*101);
			System.out.print(arr + ",");
			//n[i] = (int)(Math.random()*101);
			//System.out.print(arr);
			if(i > arr ) {
				max = i;
			}
			
			
		}
		
		System.out.println(max);
		
		/**int [] n = new int [10];
		for (int i = 0; i < n.length; i++) {
			n[i] = (int)(Math.random()*101);
			System.out.println(i);
		}
		*/
	}

}
