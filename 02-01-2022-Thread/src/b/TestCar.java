package b;

public class TestCar {

	public static void main(String[] args) {

		Car car1 = new Car(101); 
		
		CarDriver dan = new CarDriver("dan", car1, 50);
		CarDriver moshe = new CarDriver("moshe", car1, 80);
		CarDriver haim = new CarDriver("haim", car1, 90);
		CarDriver yossi = new CarDriver("yossi", car1, 20);
		
		dan.start();
		moshe.start();
		haim.start();
		yossi.start();
	}

}
