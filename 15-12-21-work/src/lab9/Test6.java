package lab9;

public class Test6 {

	public static void main(String[] args) {
		
		int a = 0;
		int b = 0;

		
		int [] num = new int [50];
		System.out.print("numbers: ");
		num[0] = (int)(Math.random()*101);
		System.out.print(num[0]);
		int max = num[0];
		int min = num[0];
		for (int i = 1; i < num.length; i++) {
			num[i] = (int)(Math.random()*101);
			System.out.print(", " + num[i]);
			
			if (num[i] > max) {
			max =num[i];
			a = i;
		}else if (num[i] < min) {
			min = num[i];
			b =i;
		}
			

		}
		
		System.out.println();
				System.out.println("max: " + max + "  index: " + a);
				System.out.println("min: " + min + "  index: " + b);
		
		
		
		}

}
