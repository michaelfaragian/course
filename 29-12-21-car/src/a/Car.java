package a;

public  class Car {
	
	
	private int number;
	private int speed; // (0 - 110);
	
	public Car() {
		super();
	}

	public Car(int number, int speed) {
		super();
		this.number = number;
		setSpeed(speed);
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		if (speed <= 110 && speed >=0) {
			this.speed = speed;
		}
	}

	@Override
	public String toString() {
		return "Car [number=" + number + ", speed=" + speed + "]";
	}
	
	

}
