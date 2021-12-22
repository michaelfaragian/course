package lab9;

public class Test5 {

	public static void main(String[] args) {
		
		int sume = 0;
		int sumo = 0;
		
		int [] num = new int [10];
		System.out.print("numbers: ");
		for (int i = 0; i < num.length; i++) {
			num[i] = (int)(Math.random()*101);
			System.out.print(num[i] + ", ");
			
		}
		System.out.println();
		for (int i = 0; i < num.length; i++) {
			if (num[i] % 2 == 0) {
				System.out.print("; even: " + num[i]);
				sume += num[i];
			} else {
				System.out.print("; odd: " + num[i]);
				sumo += num[i];

			}
			}
		System.out.println();
		System.out.println("even sum: " + sume);
		System.out.println("odd sum: " + sumo);
		
		if (sume > sumo) {
			System.out.println("even sum bigger");
		}else {
			
			System.out.println("odd bigger");
		}
		
	}		
	}


