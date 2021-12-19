package lab8;



public class Test3MAX {

	public static void main(String[] args) {

		int max = 0;
		int arr [] = new int [10];
		for (int i = 0; i < 10; i++) {
			arr [i] = (int)(Math.random()*101);
			System.out.print(arr[i] + ",");
			if(arr [i] > max) {
			max = arr[i];
			}
			
			
			
		}
		System.out.println();
		System.out.println(max);
		
	}
		
		}
	
	

	
