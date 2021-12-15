package c;

public class testpoint {

	public static void main(String[] args) {

		point p1 = new point();
		p1.print();

		p1.x = 100;
		p1.y = 50;
		p1.print();
		p1.moveRight();
		p1.moveUp();
		p1.print();

	}

}
