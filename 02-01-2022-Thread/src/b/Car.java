package b;

import java.util.ArrayList;
import java.util.List;

public class Car {
	
	private int number;
	private int km;
	private List<String> registeradDriver = new ArrayList<>();
	
	
	public Car(int number) {
		
		this.number = number;
	}

	
	
	public synchronized void drive(int distance) {
		Thread driver = Thread.currentThread();
		System.out.println("driver " + driver.getName() + " started at " + km + " km. for a distance of " + distance
				+ " with car " + number);
		km += distance;
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("driver " + driver.getName() + " finished at " + km + " km. with car " + number);
	}
	public void register() {
		Thread driver = Thread.currentThread();
		registeradDriver.add(driver.getName());
		System.out.println("\tdriver " + driver.getName() + " registered to car " + number);
	}
}
