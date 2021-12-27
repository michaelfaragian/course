package a;

import java.util.Arrays;

public class StoreStatistics {

	public static void main(String[] args) {

		Store shuk = new Store();
		
		System.out.println(shuk.getAll());
		
		//System.out.println(Arrays.toString(shuk.getFruits()));
		
		
		
		
		
		
		public static Fruit fullApple() {
		int a;
		String b;
		for (int i = 0; i < 100; i++) {
			a = (int) (Math.random()*4);
			if (a <2) {
				b = "bad";
			}	else {
				b = "good";
			}
			Store shuk = new Store();
			return shuk.addFruit(new Apple(b, (int)(Math.random()*100)+ 10));
		}
		
	}
}
	

