package a;

import java.util.Arrays;

public class Highway {

	private String name;

	private Car[] cars = new Car[(int)(Math.random()*100)];

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Highway() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Highway(String name) {
		this.name = name;
	}

	public Highway(String name, Car[] cars) {
		this(name);
		this.cars = cars;
	}

	public void addCar(Car car) {
		for (int i = 0; i < cars.length; i++) {
			if (cars[i] == null) {
				cars[i] = car;
				return;
			}
		}
	}

	

	public Car[] getCars() {
		return cars;
	}

	public void setCars(Car[] cars) {
		this.cars = cars;
	}

	@Override
	public String toString() {
		return "israel [name=" + name + ", cars=" + Arrays.toString(cars) + "]";
	}

}
