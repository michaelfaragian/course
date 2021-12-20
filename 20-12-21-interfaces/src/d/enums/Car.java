package d.enums;

import java.util.Objects;

public class Car {
	
    private int number;
	private int speed;
	Color color;
	private Type type;
	
	// inner enum definition
	public enum Type{
		FAMILY, SPORT, MINI, SUV;
	}
	
	public Car() {
		super();
	}


	public Car(int number, int speed, Color color, Type type) {
		super();
		this.number = number;
		this.speed = speed;
		this.color = color;
		this.type = type;
	}


	
	

	public Type getType() {
		return type;
	}


	public void setType(Type type) {
		this.type = type;
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
		this.speed = speed;
	}


	public Color getColor() {
		return color;
	}


	public void setColor(Color color) {
		this.color = color;
	}


	@Override
	public String toString() {
		return "Car [number=" + number + ", speed=" + speed + ", color=" + color + ", type=" + type + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(number);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		return number == other.number;
	}

	
	

}
