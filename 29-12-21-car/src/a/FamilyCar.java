package a;

public class FamilyCar extends Car {

	public FamilyCar() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FamilyCar(int number, int speed) {
		super(number, speed);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "family car [number=" + getNumber() + ", speed=" + getSpeed() + "]";
	}
	

	
	

}
