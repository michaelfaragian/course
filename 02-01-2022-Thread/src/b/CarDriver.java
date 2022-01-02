package b;

public class CarDriver extends Thread {
	
	Car car = new Car(101);
	
	private int Distance;

	public CarDriver(String name, Car car, int distance) {
		super(name);
		this.car = car;
		Distance = distance;
	}

	@Override
	public void run() {
		car.register();
		car.drive(Distance);
	}
	
	
	
	

}
