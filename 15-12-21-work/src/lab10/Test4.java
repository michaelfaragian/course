package lab10;


public class Test4 {

	public static void main(String[] args) {
		
//		int savg = 0;
//		int ssum = 0;
//		int cavg = 0;
		int csum = 0;
		int sum = 0;
		
		int [][] arr = new int [20][10];
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = (int)(Math.random()*21)+80;
				System.out.print(arr[i][j] + ",  ");
				sum += arr[i][j];
				
				 
				
		}
			System.out.println("the avg: " + sum / 10);
			System.out.println();
			csum +=sum;
			sum =0;
		}
		
		System.out.println("class avg: " + csum / 200);
		
			
		}
		
	}


