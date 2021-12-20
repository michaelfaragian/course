package d.enums;

import d.enums.Car.Type;

public class Cartest {

	public static void main(String[] args) {

		Car car = new Car(103, 80, Color.BLACK,Type.SPORT);
		System.out.println(car);
		
		Car car2 = new Car(58, 78, Color.WHITE,Type.SUV);
		System.out.println(car2);
	}

}
