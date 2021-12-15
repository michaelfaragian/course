package app.core;

public class Rectangle {
	
	private int lenght;
	private int width;
	
	public Rectangle(int lenght,int width) {
		super();
		this.lenght = lenght;
		this.width = width;
	}

	public int getLenght() {
		return lenght;
	}

	public void setLenght(int lenght) {
		this.lenght = lenght;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}
	public int getArea() {
		return width*lenght;
		
	}
	public int getParimeter() {
		return width*2 + lenght*2;
	}
	public void print () {
		System.out.println();
	}

}
