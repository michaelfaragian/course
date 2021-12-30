package a;

public class Main {

	public static void main(String[] args) {

		Country israel = new Country();
		doCountry(israel);
		doHighway(israel);
		showCountry(israel);
		countryCars(israel);
		highwayCars(israel);
		System.out.println(avgSpeed(israel));
		

		// random();
	}

	private static int avgSpeed(Country country) {
		int sum = 0;
		
		for (int i = 0; i < country.getHighways().length; i++) {
			for (int j = 0; j < country.getHighways()[i].getCars().length; j++) {
				 sum +=  country.getHighways()[i].getCars()[j].getSpeed();
			}
		}
		return sum / countryCars(country);
	}

	private static void highwayCars(Country israel) {
		int counter = 0;
		for (int i = 0; i < israel.getHighways().length; i++) {
			counter = 0;
			for (int j = 0; j < israel.getHighways()[i].getCars().length; j++) {
				counter++;
			}
			System.out.println("in " + israel.getHighways()[i].getName() + " have: " + counter + " cars");
		}
	}

	private static int countryCars(Country israel) {
		int counter = 0;
		for (int i = 0; i < israel.getHighways().length; i++) {
			for (int j = 0; j < israel.getHighways()[i].getCars().length; j++) {
				counter++;
			}
		}
		System.out.println("the number of cars in country: " + counter);
		return counter;
	}

	private static Car random() {

		int x = (int) (Math.random() * 3);
		int number = (int) (Math.random() * 500) + 100;
		int speed = (int) (Math.random() * 111);

		Car car;
		if (x < 2) {
			car = new SportCar(number, speed);
		} else {
			car = new FamilyCar(number, speed);
		}
		return car;
	}

	private static void doHighway(Country country) {

		for (int i = 0; i < country.getHighways().length; i++) {
			int lenCars = country.getHighways()[i].getCars().length;
			for (int j = 0; j < lenCars; j++) {
				Car car = random();
				country.getHighways()[i].addCar(car);

			}
		}

	}

	public static void doCountry(Country country) {
		for (int i = 0; i < country.getHighways().length; i++) {
			Highway highway = new Highway("highway " + (i + 1));
			country.addHighway(highway);

		}
	}

	private static void showCountry(Country country) {
		for (int i = 0; i < country.getHighways().length; i++) {
			System.out.println(country.getHighways()[i]);
		}
	}
}
